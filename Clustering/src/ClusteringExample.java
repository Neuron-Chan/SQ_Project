import java.io.File;

import net.sf.javaml.clustering.evaluation.AICScore;
import net.sf.javaml.clustering.evaluation.BICScore;
import net.sf.javaml.clustering.evaluation.ClusterEvaluation;
import net.sf.javaml.clustering.evaluation.SumOfAveragePairwiseSimilarities;
import net.sf.javaml.clustering.evaluation.SumOfSquaredErrors;

import net.sf.javaml.clustering.AQBC;
import net.sf.javaml.clustering.Clusterer;
import net.sf.javaml.clustering.DensityBasedSpatialClustering;
import net.sf.javaml.clustering.KMeans;
import net.sf.javaml.core.Dataset;
import net.sf.javaml.tools.data.FileHandler;

public class ClusteringExample {
    
	public static void main(String[] args) throws Exception {
    
		// Read iris.data dataset
        Dataset dataset = FileHandler.loadDataset(new File("resources/iris.data"), 4, ",");

        // Declare algorithms
        // Perform clustering operation using Javaml KMeans
        Clusterer km = new KMeans();
        
        // Perform clustering operation using Javaml AQBC
        Clusterer ad = new AQBC(); 
        
        // Perform clustering operation using Javaml Density-Based Spatial Clustering (DBSC)
        Clusterer sp = new DensityBasedSpatialClustering();
        
        // initialize datasets
        Dataset[] cluster1 = km.cluster(dataset);
        Dataset[] cluster2 = ad.cluster(dataset);
        Dataset[] cluster3 = sp.cluster(dataset);
        
        
       
        
        //total time for each method
        long[] totalTime = new long[3];
        
        long start = 0;
        long end = 0;
        
        //Cluster Execution ----------------------
        start = System.nanoTime();
        cluster1 = km.cluster(dataset);
        end = System.nanoTime();
        totalTime[0] = end - start;
        
        start = System.nanoTime();
        cluster2 = ad.cluster(dataset);
        end = System.nanoTime();
        totalTime[1] = end - start;
        
        start = System.nanoTime();
        cluster3 = sp.cluster(dataset);
        end = System.nanoTime();
        totalTime[2] = end - start;
        
        
        //Cluster Evaluation ----------------------
        ClusterEvaluation aic = new AICScore();
        ClusterEvaluation bic = new BICScore();
        ClusterEvaluation squared = new SumOfSquaredErrors();
        ClusterEvaluation pairwise = new SumOfAveragePairwiseSimilarities();
        
        double[] aicScore = new double[3];
        double[] bicScore = new double[3];
        double[] sseScore = new double[3];
        double[] sapsScore = new double[3];
        
        aicScore[0] = aic.score(cluster1);
        bicScore[0] = bic.score(cluster1);
        sseScore[0] = squared.score(cluster1);
        sapsScore[0] = pairwise.score(cluster1);
        
        aicScore[1] = aic.score(cluster2);
        bicScore[1] = bic.score(cluster2);
        sseScore[1] = squared.score(cluster2);
        sapsScore[1] = pairwise.score(cluster2);
        
        aicScore[2] = aic.score(cluster3);
        bicScore[2] = bic.score(cluster3);
        sseScore[2] = squared.score(cluster3);
        sapsScore[2] = pairwise.score(cluster3);
        
        System.out.println("\n--------------------------------------------------------------------------------------------");
        System.out.println("\n");
        for (int i = 0; i < cluster1.length; i++) {
            System.out.println("Cluster " + (i + 1) + " size: " + cluster1[i].size());
        }
        System.out.println("\n");
        for (int i = 0; i < cluster2.length; i++) {
            System.out.println("Cluster " + (i + 1) + " size: " + cluster2[i].size());
        }
        System.out.println("\n");
        for (int i = 0; i < cluster3.length; i++) {
            System.out.println("Cluster " + (i + 1) + " size: " + cluster3[i].size());
        }
        System.out.println("\n");
        
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\tKMeans\t\tAQBC\t\tDensity-Based");
        System.out.printf("Cluster Count: \t\t" + "%d" + "\t\t" + "%d" + "\t\t" + "%d\n", cluster1.length, cluster1.length, cluster1.length);
        System.out.printf("AIC Score: \t\t" + "%.2f" + "\t\t" + "%.2f" + "\t" + "%.2f\n", aicScore[0], aicScore[1], aicScore[2]);
        System.out.printf("BIC Score: \t\t" + "%.2f" + "\t\t" + "%.2f" + "\t" + "%.2f\n", bicScore[0], bicScore[1], bicScore[2]);
        System.out.printf("Sum of Squared Errors: \t" + "%.2f" + "\t\t" + "%.2f" + "\t\t" + "%.2f\n", sseScore[0], sseScore[1], sseScore[2]);
        System.out.printf("Pairwise Similarities: \t" + "%.2f" + "\t\t" + "%.2f" + "\t\t" + "%.2f\n", sapsScore[0], sapsScore[1], sapsScore[2]);
        System.out.printf("Excution Time(ms): \t" + "%d" + "\t\t" + "%d" + "\t\t" + "%d\n", totalTime[0]/100000, totalTime[1]/100000, totalTime[2]/100000);
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
		}
	
}
    
public class SortedIntList extends IntList {

	public SortedIntList(int size) {
		super(size);		
	}
	
	public void add(int value)
	{
		
		if (numElements == list.length)
		{
			System.out.println("Can't add, list is full");
		}
		else
		{
			for (int i = 0; i < list.length; i++)
			{
				//if the new value is lower than the value in the list (or if the current element is unused)
				if (value < list[i] || i == numElements)
				{
					//moves all of the current values one index higher
					for (int k = list.length - 2; k >= i; k--)
					{
						list[k + 1] = list[k];
					}
					//inserts new value
					list[i] = value;
					//increases count of inserted elements
					numElements++;
					break;
				}
			}
		}
	}
	
	public String toString()
	{
		return "Sorted list:\n" + super.toString();
	}
}
//During the last week of track trainging. Shoshanna achieves the following times in sec rounds 
//66,57,54,53,64,52 and 59
//Found her best score

public class Day5 {
public static void main(String[] args) {
	int array[]= {66,57,54,53,64,52,59};
	int max=array[0];
	int i = 0;
	for(i=0;i<array.length;i++)
	{
	if(array[i]>max)
	{
		max=array[i];
		i++;
	}
	}
	System.out.println("Shoshanna achieves the best score of  :"+max);
}

}

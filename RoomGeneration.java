//executed upon startup
public class RoomGeneration 
{
	public int[] pickRooms()
	{
		int[] rooms = new int[3];
		int num=0;
		int check=0;
		for(int c=0;c<3;c++)
		{
			num = (int)Math.round((Math.random()*5)+1);
			check = 1;
			for(int c2=0;c2<2;c2++)
			{
				if(num==rooms[c2])
				{
					check=0;
				}
			}
			if(check==1)
			{
				rooms[c] = num;
			}
			else
			{
				c--;
			}
		}
		return rooms;
	}
}


public class shortestPath {
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println("Shortest Path: "+getShortestpath(path));
    }

    public static float getShortestpath(String path)
    {
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            //NORTH
            if(dir == 'N')
                y++;
            //SOUTH
            else if(dir == 'S')
                y--;
            //EAST
            else if(dir =='E')
                x++;
            //WEST
            else
                x--;
        }
        
        // Or int X1=x*x;
        //    int Y1=x*x;
        return (float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
}
//O(n)
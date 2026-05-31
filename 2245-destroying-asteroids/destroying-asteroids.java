class Solution 
{
    public boolean asteroidsDestroyed(int mass, int[] asteroids) 
    {
        Arrays.sort(asteroids);
        int n=asteroids.length;
        for(int i=0;i<n;i++)
        {
            if(asteroids[n-1]<=mass)
            break;
            if(mass<asteroids[i])
            return false;
            mass+=asteroids[i];
        }
        return true;

    }
}
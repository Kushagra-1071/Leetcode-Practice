class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long total=0;
        for(int studentUse: chalk)
        {
            total+=studentUse;
        }
        int remaining=(int)(k%total);
        for(int studentIndex=0;studentIndex<chalk.length;studentIndex++)
        {
            if(remaining<chalk[studentIndex])
            {
                return studentIndex;
            }
            remaining-=chalk[studentIndex];
        }
        return 0;
    }
}
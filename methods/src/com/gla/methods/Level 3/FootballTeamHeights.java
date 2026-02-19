class FootballTeamHeights {
    public int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        return sum;
    }

    public double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] < min) min = arr[i];
        return min;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];
        return max;
    }

    public static void main(String[] args) {
        FootballTeamHeights obj = new FootballTeamHeights();
        int[] heights = obj.generateHeights(11);
        System.out.println("Shortest: " + obj.min(heights));
        System.out.println("Tallest: " + obj.max(heights));
        System.out.println("Mean: " + obj.mean(heights));
    }
}

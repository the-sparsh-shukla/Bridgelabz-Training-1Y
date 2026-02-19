class EmployeeBonus {

    public static double[][] generateData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random()*90000)+10000;
            data[i][1] = (int)(Math.random()*10)+1;
        }
        return data;
    }

    public static double[][] calculate(double[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? salary*0.05 : salary*0.02;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void totals(double[][] oldData,double[][] newData) {
        double oldSum=0,newSum=0,bonusSum=0;
        for (int i = 0; i < oldData.length; i++) {
            oldSum += oldData[i][0];
            newSum += newData[i][0];
            bonusSum += newData[i][1];
        }
        System.out.println("Old Salary Total: "+oldSum);
        System.out.println("New Salary Total: "+newSum);
        System.out.println("Total Bonus: "+bonusSum);
    }

    public static void main(String[] args) {
        double[][] data = generateData(10);
        double[][] result = calculate(data);
        totals(data,result);
    }
}

package soft2036.DataStr.week10;

public class demo_sort {
    public static void main(String[] args) {
        //冒泡排序算法
        int[] numbers=new int[]{75,23,98,44,57,12,29,64,38,82};
        boolean exchange=false;
        //需进行length-1次冒泡
        for(int i=0;i<numbers.length-1;i++)
        {
            exchange=false;
            for(int j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    exchange=true;
                }
                if (!exchange) {
                    System.out.println("这轮没有交换");
                }
            }
            System.out.println("这是从小到大排序后的结果");
            for (int x = 0; x < numbers.length; x++) {
                System.out.print(numbers[x] + " ");
            }

        }

    }
}
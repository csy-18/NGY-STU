package DataStr.week7;

/**
 * @ClassName MatGraph
 * @Description TODO
 * @Author csy
 * @Date 2020-11-17
 */
public class MatGraph {
    final int MAXV = 100;            //表示最多顶点个数
    final int INF = 0x3f3f3f3f;        //表示∞
    int[][] edges;            //邻接矩阵数组，元素为int类型
    int n, e;                //顶点数，边数
    String[] vexs;            //存放顶点信息

    public MatGraph() {
        edges = new int[MAXV][MAXV];
        vexs = new String[MAXV];
    }

    public void CreateMatGraph(int[][] a, int n, int e) {
        this.n = n;
        this.e = e;
        for (int i = 0; i < n; i++) {
            edges[i] = new int[n];
            for (int j = 0; j < n; j++) {
                edges[i][j] = a[i][j];
            }
        }
    }

    public void DisMatGraph() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (edges[i][j] == INF)
                    System.out.printf("%4s", "∞");
                else
                    System.out.printf("%5d", edges[i][j]);
                System.out.println();
            }
        }
    }

    public static int Degree1(MatGraph g, int v)
//无向图邻接矩阵中求顶点v的度
    {
        int d = 0;
        for (int j = 0; j < g.n; j++)    //统计第v行的非0非∞元素个数
            if (g.edges[v][j] != 0 && g.edges[v][j] != g.INF)
                d++;
        return d;
    }

    public static int[] Degree2(MatGraph g, int v)
//有向图邻接矩阵中求顶点v的出度和入度
    {
        int[] ans = new int[2];
        ans[0] = 0;            //累计出度
        for (int j = 0; j < g.n; j++)    //统计第v行的非0非∞元素个数为出度
            if (g.edges[v][j] != 0 && g.edges[v][j] != g.INF)
                ans[0]++;
        ans[1] = 0;            //累计入度
        for (int i = 0; i < g.n; i++)    //统计第v列的非0非∞元素个数为入度
            if (g.edges[i][v] != 0 && g.edges[i][v] != g.INF)
                ans[1]++;
        ;
        return ans;            //返回出度和入度
    }

    public static void main(String[] args) {

    }


}

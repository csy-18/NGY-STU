package DataStr.week8;


import com.mysql.cj.x.protobuf.MysqlxDatatypes;

/**
 * @ClassName AdjGraph
 * @Description TODO
 * @Author csy
 * @Date 2020-11-24
 */
public class ArcNode { //边结点类
    int adjvex;   //该边的终点编号
    ArcNode nextarc; //指向下一条边的指针
    int weight; //该边的相关信息

}

class VNode {  //头结点类
    String[] data; //顶点信息
    ArcNode firstarc; //指向第一条边的领结顶点
}

class AdjGraph {  //图领接表类
    final int MAXV = 100; //表示最多顶点个数
    final int INF = 0x3f3f3f3f; //表示∞
    VNode[] adjlist;  //领接表头组
    int n, e;   //图中顶点数n和边数e

    public AdjGraph() {
        adjlist = new VNode[MAXV];
        for (int i = 0; i < MAXV; i++) {
            adjlist[i] = new VNode();
        }
    }

    public void CreateAdjGraph(int[][] a, int n, int e) {
        this.n = n;
        this.e = e; //置顶点数和边数
        ArcNode p;
        for (int i = 0; i < n; i++) {  //所有头结点的指针置初值
            adjlist[i].firstarc = null;
        }
        for (int i = 0; i < n; i++) {  //检查边数组a中每个元素
            for (int j = n - 1; j >= 0; j--) {  //创建一个边结点p
                if (a[i][j] != 0 && a[i][j] != INF) {
                    p = new ArcNode();
                    p.adjvex = j;
                    p.weight = a[i][j];
                    p.nextarc = adjlist[i].firstarc; //采用头插法插入p
                    adjlist[i].firstarc = p;
                }

            }
        }
    }


}
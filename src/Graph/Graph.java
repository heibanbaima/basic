package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int v; // 顶点的个数
    private LinkedList<Integer> adj[];

    public Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s,int t){ //无向图一条边存两次
        adj[s].add(t);
        adj[t].add(s);
    }

    public void bfs(int s,int t){
        if (s == t) return;
        boolean[] visited = new boolean[v];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int[] prev = new int[v];
        for (int i = 0; i < v; i++){
            prev[i] = -1;
        }
        while (queue.size() != 0){
            int w = queue.poll();
            for (int i = 0; i < adj[w].size();i++){
                int q = adj[w].get(i);
                if (!visited[q]){
                    prev[q] = w;
                    if (q == t){
                        print(prev,s,t);
                    }
                }
            }
        }
    }

    private void print(int[] prev,int s,int t){
        if (prev[t] != -1 && t != s){

        }
    }
}

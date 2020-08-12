import java.util.LinkedList;
import java.util.Queue;

public class Ac {
    private AcNode root = new AcNode('/');

    public void insert(char[] text){
        AcNode p = root;
        for (int i = 0; i < text.length; i++){
            int index = text[i] - 'a';
            if (p.children[index] == null){
                AcNode newNode = new AcNode(text[i]);
                p.children[index] = newNode;
            }
            p = p.children[index];
        }
        p.isEndingChar = true;
    }

    public void buildFailurePointer(){
        Queue<AcNode> queue = new LinkedList<>();
        root.fail = null;
        queue.add(root);
        while (!queue.isEmpty()){
            AcNode p = queue.remove();
            for (int i = 0; i < 26; i++){
                AcNode pc = p.children[i];
                if (pc == null) continue;
                if (p == root){
                    pc.fail = root;
                }else {
                    AcNode q = p.fail;
                    while (q != null){
                        AcNode qc = q.children[pc.data-'a'];
                        if (qc != null){
                            pc.fail = qc;
                            break;
                        }
                        q=q.fail;
                    }
                    if (q == null){
                        pc.fail = root;
                    }
                }
                queue.add(pc);
            }
        }
    }

    public void match(char[] text){
        int n = text.length;
        AcNode p = root;
        for (int i = 0; i < n; i++){
            int idx = text[i] - 'a';
            while (p.children[idx] == null && p != root){
                p = p.fail;
            }
            p = p.children[idx];
            if (p == null) p = root; //如果没有匹配的，从root开始重新匹配
            AcNode tmp = p;
            while (tmp != root){
                if (tmp.isEndingChar == true){
                    int pos = i - tmp.length +1;
                    System.out.println("匹配起始下标"+pos+"；长度"+tmp.length);
                }
                tmp = tmp.fail;
            }
        }
    }
}
class AcNode{
    public char data;
    public AcNode[] children = new AcNode[26];
    public boolean isEndingChar = false;
    public int length = -1;
    public AcNode fail;
    public AcNode(char data){
        this.data = data;
    }
}
class TrieNode{
    public char data;
    public TrieNode[] children = new TrieNode[26];
    public boolean isEndingChar = false;
    public TrieNode(char data){
        this.data = data;
    }
}
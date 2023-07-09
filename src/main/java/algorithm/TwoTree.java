package algorithm;

import java.util.Map;
import java.util.zip.Adler32;

/**
 * @author shkstart
 * @create 2023-06-29 20:41
 */
public class TwoTree {
    public static void main(String[] args) {
        int[] arr={7,3,10,1,5,1,9};
        BinarySortTree binarySortTree = new BinarySortTree();
        for (int i=0;i<arr.length;i++){
            binarySortTree.add(new Node(arr[i]));
        }
        binarySortTree.infixOrder();

    }
}
//创建二叉排序树
class BinarySortTree{
    private Node root;
    //添加节点方法
    public void add(Node node){
        if (root ==null){
            root=node;
        }else {
            root.add(node);
        }
    }
    //中序遍历
    public void infixOrder(){
        if (root !=null){
            root.infixOrder();
        }else {
            System.out.println("二叉树为空");
        }
    }
}

//创建Node节点
class Node{
    int value;
    Node left;
    Node right;
  public Node(int value){
      this.value=value;
  }
  //递归形式添加结点。
  public void add(Node node){
      if (node ==null){
          return;
      }
      if (node.value<this.value){
          //如果当前节点左节点为空，则直接添加
          if (this.left==null){
              this.left=node;
          }else {
              //如果不为空则执行子节点的add操作
              this.left.add(node);
          }
      }else {
          if (this.right==null){
              this.right=node;
          }else {
              this.right.add(node);
          }
      }
  }
  //中序遍历
    public void infixOrder(){
        //如果左节点有值，那么就先执行左节点调用infixOrder()
        //最终总会有一个节点左节点是没有值的，然后打印后判断右节点是否还有值，到最终节点后，依次结束方法调用。
      if (this.left!=null){
          this.left.infixOrder();
      }
          System.out.println(this);
      if (this.right!=null){
          this.right.infixOrder();
      }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}

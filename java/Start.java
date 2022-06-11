class Start{
    public static void main(String[] data){
        Tree b = new Tree();
        Element root = b.create(6,3,8,4,1,5,2,8);
        b.print(root);
    }
}

class Tree{
    void print(Element p){
        if(p==null) return;
        print(p.left);
        System.out.println(p.key);
        print(p.right);
    }
    int maximum(Element c){
        if (c==null) return 0;
        if (c.right == null) return c.key;
        return maximum(c.right);
    }
    int countLeaf(Element c){
        if(c==null) return 0;
        if(c.left == null && c.right == null) return 1;
        int a = countLeaf(c.left);
        int b = countLeaf(c.right);
        return a+b;
    }
    int height(Element c){
        if(c==null) return 0;
        int a = height(c.left);
        int b = height(c.right);
        return a > b ? a + 1 : b + 1;
    }
    Element create(int ... a){
        Element root = null;
        for(int i=0;i<a.length;i++){
            root = insert(root,a[i]);
        }
        return root;
    }
    
    Element insert(Element parent, int k){
        if(parent==null){
            parent = new Element();
            parent.key = k;
            return parent;
        }
        if(parent.key >= k){
            parent.left = insert(parent.left,k);
        }
        if(parent.key <= k){
            parent.right = insert(parent.right,k);
        }
        return parent;
    }
    
    int sum(Element c){
        if(c==null) return 0;
        return c.key + sum(c.left) + sum(c.right);
    }
}

class Element{
    int key;
    Element left,right;
}

//class Start{
//    public static void main(String[] data){
//        Engine e = new Engine();
//        int[] a = {8,6,5,1,4,3,7,2,9};
//        Element root = e.create(a);
//        int t = e.max(root);
//        System.out.print(t);
//    }
//}
//
//class Engine{
//    int count(Element c){
//        if (c==null) return 0;
//        return 1 + count(c.left) +count(c.right);
//    }
//    
//    int sum(Element c){
//        if (c==null) return 0;
//        return c.number + sum(c.left) + sum(c.right);
//    }
//    
//    int max(Element c){
//        if (c==null) return 0;
//        int a = max(c.left);
//        int b = max(c.right);
//        if (a >= b && a > c.number){return a;}
//        if (b >= a && b > c.number){return b;}
//        return c.number;
//    }
//    
//    Element create(int[] a){
//        return create(a , 0 , a.length-1);
//    }
//    
//    Element create(int[] a,int start,int finish){
//        if (start > finish){
//            return null;
//        }
//        int mid = (start + finish) / 2;
//        Element result = new Element();
//        result.number = a[mid];
//        result.left = create(a, start, mid-1);
//        result.right = create(a, mid+1, finish);
//        return result;
//    }
//}
//
//class Element{
//    int number;
//    Element left,right;
//}



//class Start{
//    public static void main(String[] data){
//        Player root = new Player();
//        root.name = "David";
//        root.number = 7;
//        Player p1 = new Player();
//        p1.name = "Frank";
//        p1.number = 8;
//        root.left = p1;
//        System.out.println(root.left.name);
//        root.right = new Player();
//        root.right.name ="Michael";
//        root.right.number = 8;
//        root.right.right = new Player();
//        root.right.right.name = "Steven";
//        root.right.right.number = 8;
//    }
//}
//
//class Player{
//    String name;        // default is null
//    int number;         // default is 0
//    Player left;        // default is null
//    Player right;       // default is null
//}
//
///* https://codestart.work//java-03.pdf */
package SearchAl;

public class BlockSearch {
    static void main(String[] args) {
        //分块查找
        int[] arr = {16, 5, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66};
        //定义三个块的对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 18);
        //创建索引数组
        Block[] blocks = {b1, b2, b3};
        //记录要查找的元素
        int nummer = 61;
        int index = getIndex(blocks, arr, nummer);
        if (index == -1) {
            System.out.println("没有找到");
        } else {
            System.out.println("该元素的下标是" + index);
        }
    }


    private static int getIndex(Block[] blocks, int[] arr, int nummer) {
        //1.确定查找的nummer在哪一个模块
        int blockIndex = getBlockIndex(blocks, nummer);
        if (blockIndex == -1) {
            return -1;
        }
        int max = blocks[blockIndex].getStartIndex();
        int min = blocks[blockIndex].getEndIndex();
        for (int i = max; i < min; i++) {
            if (arr[i] == nummer) {
                return i;
            }
        }
        return -1;

    }

    private static int getBlockIndex(Block[] blocks, int nummer) {
//        Block b1=new Block(21,0,5);
//        Block b2=new Block(45,6,11);
//        Block b3=new Block(73,12,18);
        for (int i = 0; i < blocks.length; i++) {
            if (nummer < blocks[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }


    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }


    public int getEndIndex() {
        return endIndex;
    }


    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}


package ����԰;

import java.util.Random;


class BinaryIndexedTree {
    public int length;
    private int[] tree;
    /**
     * Ϊ��ͳһ�±꣬����tree[0]����ʹ�ã�������Ч��Χ1~length��
     * */
    public BinaryIndexedTree(int length){
        this.length=length;
        tree=new int[length+1];
    }
    /**
     * ����1~index��Χ�ں�
     * indexһֱ��ȥlowBit(index)��ֱ��indexΪ0
     * */
    public int sum(int index){
        if (index<1&&index>length) {
            throw new IllegalArgumentException("Out of Range!");
        }
        int sum=0;
        while (index>0) {
            sum+=tree[index];
            index-=lowBit(index);
        }
        return sum;
    }
    /**
     * ����start~end��Χ�ں�
     * */
    public int  sum(int start,int end) {
        return sum(end)-sum(start-1);
    }
    /**
     * indexһֱ����lowBit(index)��ֱ��indexΪlength����Щλ�õ�ֵ������value
     * */
    public void put(int index,int value){
        if (index<1&&index>length) {
            throw new IllegalArgumentException("Out of Range!");
        }
        while (index<=length) {
            tree[index]+=value;
            index+=lowBit(index);
        }
    }
    /**
     * indexһֱ��ȥlowBit(index)��ֱ��indexΪlength����Щλ�õ�ֵ������value
     * */
    public int get(int index){
        if (index<1&&index>length) {
            throw new IllegalArgumentException("Out of Range!");
        }
        int sum=tree[index];
        int z=index-lowBit(index);
        index--;
        while (index!=z) {
            sum-=tree[index];
            index-=lowBit(index);
        }
        return sum;
    }
    /**
     * ����k�Ķ��������λ1��ֵ�����磬1110�������λ1��0010.
     * */
    private static int lowBit(int k){
        return k&-k;
    }
}
public class ��״���� {

	public static void main(String[] args) {
        int length=15;
        BinaryIndexedTree bTree=new BinaryIndexedTree(length);
        Random random=new Random();
        //�����������
        for (int i = 1; i <= bTree.length; i++) {
            bTree.put(i, random.nextInt(100));
        }
        //ȡ��ÿһλ
        for (int i = 1; i <= bTree.length; i++) {
            int value=bTree.get(i);
            System.out.printf("%3d",value);
            System.out.print("  ");
        }
        System.out.println();
        //����0~i�ĺ�
        for (int i = 1; i <= bTree.length; i++) {
            int sum=bTree.sum(i);

            System.out.printf("%3d",sum);
            System.out.print("  ");
        }
        System.out.println();
        //����start~end�ĺ�
        System.out.printf("%3d",bTree.sum(2,4));
    }
}

package com.stucture.nonlinearstructure;

//稀疏数组的实现

public class Sparearray {
    //稀疏数组
    public static void changeArray(){
       //chessArray---原始数组
        int [][]chessArray=new int[5][5];
        chessArray[0][1]=5;
        chessArray[0][4]=18;
        chessArray[1][0]=18;
        chessArray[1][2]=7;
        chessArray[2][1]=6;
        chessArray[3][2]=6;
        chessArray[3][4]=5;
        chessArray[4][3]=10;
       //输出原始数组,并确定有效值个数
        int count=0;
        System.out.println("原始数组:");
        for (int row[]:chessArray){
            for (int data:row){
                if (data!=0){
                    count++;
                }
                System.out.print(data+"\t");
            }
            System.out.println();
        }
        //sparearray---稀疏数组
        int [][]sparearray=new int[count+1][3];
        sparearray[0][0]=5;
        sparearray[0][1]=5;
        sparearray[0][2]=count;
        //数据下标;
        int index=0;
        //将有效值填入稀疏数组中
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (chessArray[i][j]!=0){
                    index++;
                    sparearray[index][0]=i;
                    sparearray[index][1]=j;
                    sparearray[index][2]=chessArray[i][j];
                }
            }
        }
        System.out.println("稀疏数组:");
        for (int i=0;i< sparearray.length;i++){
            System.out.println(sparearray[i][0]+"\t"+sparearray[i][1]+"\t"+sparearray[i][2]);
        }
        //转换为二维数组
        int [][]arr=new int[sparearray[0][0]][sparearray[0][1]];
        for (int i=1;i< arr.length;i++){
            arr[sparearray[i][0]][sparearray[i][1]]=sparearray[i][2];
        }
        System.out.println("二维数组:");
        for (int []row:arr){
            for (int data:row){
                System.out.print(data+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        changeArray();
    }
}

package YangHuiTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows <= 0) {
            return result;
        }
        //处理第一行的情况
        ArrayList<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if(numRows == 1) {
            return result;
        }
        //处理第二行的情况
        ArrayList<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if(numRows == 2) {
            return result;
        }
        //处理后面的行
        //当前行的数字依赖于前一行
        //行数row从1开始算，与数组下标不一致，数组下标从0开始
        for(int row= 3; row <= numRows; row++) {
            ArrayList<Integer> preLine = (ArrayList<Integer>) result.get(row-1-1);
            ArrayList<Integer> curLine = new ArrayList<>();
            //当前行的第一列为1
            curLine.add(1);
            //第row行一共有row列
            //第2列到row-1列的数字依赖于前一行
            //列数col从1开始算，与行数row一样，数组下标从0开始算
            for(int col = 2; col < row; col++) {
                //要计算col列的值，需要知道前一行中col-1列和col列的值
                int tmp1 = preLine.get(col-1-1);   //col-1列的值
                int tmp2 = preLine.get(col-1);     //col列的值
                curLine.add(tmp1 + tmp2);
            }
            //当前行的最后一列也是1
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
}

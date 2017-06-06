package interpreter;

import java.util.Stack;

/**
 * Created by gavin on 2017/6/6.
 */
public class Calculator {

    private Stack<ArithmeticExpression> mExpStack = new Stack<>();

    public Calculator(String expression) {
        /****
         * 储存运算符两边的数字解释器
         */
        ArithmeticExpression exp1, exp2;

        String[] elements = expression.split(" ");


        for (int i = 0; i < elements.length; i++) {

            switch (elements[i].charAt(0)) {


                case '+':

                    exp1 = mExpStack.pop();

                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));

                    mExpStack.push(new AdditionExpression(exp1, exp2));

                    break;
                default:
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calcualte() {

        return mExpStack.pop().interpret();
    }
}

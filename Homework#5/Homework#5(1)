import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader bfR = new BufferedReader(new InputStreamReader(System.in));
    String s;
    try {
      System.out.println( "Please, enter operation (+, -, *, /, ^, (), <): ");
      s = bfR.readLine();
      s = o(s);
      System.out.println(calculate(s));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private static String o(String s) throws Exception {
    StringBuilder sbStack = new StringBuilder("");
    StringBuilder sbOut = new StringBuilder("");
    char c, t;

    for (int i = 0; i < s.length(); i++) {
      c = s.charAt(i);
      if (isOp(c)) {
        while (sbStack.length() > 0) {
          t = sbStack.substring(sbStack.length() - 1).charAt(0);
          if (isOp(t) && (opPrior(c) <= opPrior(t))) {
            sbOut.append(" ").append(t).append(" ");
            sbStack.setLength(sbStack.length() - 1);
          } else {
            sbOut.append(" ");
            break;
          }
        }
        sbOut.append(" ");
        sbStack.append(c);
      } else if ('(' == c) {
        sbStack.append(c);
      } else if (')' == c) {
        t = sbStack.substring(sbStack.length() - 1).charAt(0);
        while ('(' != t) {
         
          sbOut.append(" ").append(t);
          sbStack.setLength(sbStack.length() - 1);
          t = sbStack.substring(sbStack.length() - 1).charAt(0);
        }
        sbStack.setLength(sbStack.length() - 1);
      } else {

        sbOut.append(c);
      }
    }

    while (sbStack.length() > 0) {
      sbOut.append(" ").append(sbStack.substring(sbStack.length() - 1));
      sbStack.setLength(sbStack.length() - 1);
    }

    return sbOut.toString();
  }


  private static boolean isOp(char c) {
    switch (c) {
    case '-':
    case '+':
    case '*':
    case '/':
    case '^':
      return true;
    }
    return false;
  }

  private static byte opPrior(char op) {
    switch (op) {
    case '^':
      return 3;
    case '*':
    case '/':
    case '%':
      return 2;
    }
    return 1; 
  }

  private static double calculate(String s) throws Exception {

    double firstD = 0;
    double secondD = 0;
    String sTmp;

    Deque<Double> stack = new ArrayDeque<Double>();
    StringTokenizer st = new StringTokenizer(s);

    while (st.hasMoreTokens()) {
      try {
        sTmp = st.nextToken().trim();
        if (1 == sTmp.length() && isOp(sTmp.charAt(0))) {
       
          secondD = stack.pop();
          firstD = stack.pop();
          switch (sTmp.charAt(0)) {
          case '+':
            firstD += secondD;
            break;
          case '-':
            firstD -= secondD;
            break;
          case '/':
            firstD /= secondD;
            break;
          case '*':
            firstD *= secondD;
            break;
          case '%':
            firstD %= secondD;
            break;
          case '^':
            firstD = Math.pow(firstD, secondD);
            break;
          default:
            throw new Exception();
          }
          stack.push(firstD);
        } else {
          firstD = Double.parseDouble(sTmp);
          stack.push(firstD);
        }
      } catch (Exception e) {
        throw new Exception();
      }
    }


    return stack.pop();
  }
}

class Main {
    public static void main(String[] args) {
        String s = sc.next();
        String res = "", maxstr = "";
        int max=0;
       for(int i=0;i<s.length();i++)
       {
          char c=s.charAt(i);
          if(res.indexOf(c)==-1)
          {
              res=res+c;
          }
          else
          {
              if(res.length()>max)
              {
                  max=res.length();
                  maxstr=res;
              }
              int idx=res.indexOf(c);
              res=res.substring(idx+1);
              res=res+c;
          }
       }
       
       if(max<res.length())
       {
           maxstr=res;
       }
       System.out.println(maxstr);
    }
}

package com.work;

import org.rosuda.JRI.Rengine;

public class R_Java {

/*    private static String evaluate(){
        Rengine r = new Rengine(new String[]{"--no-save"}, false, null);
        System.out.println("Rengine created, waiting for R");

        // the engine creates R is a new thread, so we should wait until it's
        // ready
        if (!r.waitForR()) {
            System.out.println("Cannot load R");
            return null;
        }
        r.eval("library(Hmisc)");
        r.eval("yy <- describe(rnorm(200))");
        REXP exp = r.eval("zz <- yy$counts[5:11]");
        REXP names = r.eval("names(zz)");
        String[] strExp = exp.asStringArray();
        System.out.println("result:" + exp);

        r.eval("histval <- hist(rnorm(100), plot=FALSE)");
        REXP xvalExp = r.eval("histval$mids");
        REXP yvalExp = r.eval("histval$counts");

        return ("histval$mids:" + xvalExp + " histval$counts:" + yvalExp);
    }*/

    public static void main(String[] args) throws InterruptedException {
        System.out.println("R within Java:");
      //  System.out.println("JLP =" + System.getProperty("java.library.path"));

//        evaluate();


  //      System.out.println("Testing R code in Java");
  //      System.out.println(evaluate());



        /*
        Rengine re = new Rengine(new String[] { "--vanilla" }, false, null);
        System.out.println("Rengine created, waiting for R");

        // the engine creates R is a new thread, so we should wait until it's
        // ready
        if (!re.waitForR()) {
            System.out.println("Cannot load R");
            return;
        }

        re.eval("data(iris)", false);
        REXP x = re.eval("iris");
        // generic vectors are RVector to accomodate names
        RVector v = x.asVector();
        System.out.println("has names:");
        for (Enumeration e = v.getNames().elements(); e.hasMoreElements();) {
            System.out.println(e.nextElement());
        }

        // for compatibility with Rserve we allow casting of vectors to lists
        RList vl = x.asList();
        String[] k = vl.keys();
        System.out.println("and once again from the list:");
        int i = 0;
        while (i < k.length)
            System.out.println(k[i++]);

        // get boolean array
        System.out.println(x = re.eval("iris[[1]]>mean(iris[[1]])"));

        // R knows about TRUE/FALSE/NA, so we cannot use boolean[] this way
        // instead, we use int[] which is more convenien0t (and what R uses
        // internally anyway)
        int[] bi = x.asIntArray();
        for (int j : bi) {
            System.out.print(j == 0 ? "F " : (j == 1 ? "T " : "NA "));
        }
        System.out.println("");

        // push a boolean array
        boolean by[] = { true, false, false };
        re.assign("bool", by);
        System.out.println(x = re.eval("bool"));

        // asBool returns the first element of the array as RBool
        // (mostly useful for boolean arrays of the length 1). is should
        // return true
        System.out.println("isTRUE? " + x.asBool().isTRUE());

        // now for a real dotted-pair list:
        System.out.println(x = re.eval("pairlist(a=1,b='foo',c=1:5)"));
        RList l = x.asList();

        int idx = 0;
        String[] a = l.keys();
        System.out.println("Keys:");
        while (idx < a.length)
            System.out.println(a[idx++]);

        System.out.println("Contents:");
        idx = 0;
        while (idx < a.length)
            System.out.println(l.at(idx++));

        System.out.println(re.eval("sqrt(36)"));
        */


        Rengine re = new Rengine(new String [] {"--vanilla"}, false, null);
       // re.eval("plot(11,11)");
     //   System.out.println(re.eval("? par"));
      //  re.eval("par(mfrow=c(1, 2))");
       // re.eval("hist(data_ol, breaks=0:8, right=F, col=slateblue1, main=Гистограмма НД2, xlab=x.txt, ylab=Число респондентов)");
      //  re.eval("plot(density(data), type=\"l\", col=\"seagreen\", lwd=2, main=\"Сглаженная плотность НД1\")");
        re.eval("plot(10,50)");


        System.out.println(re.eval("list(1,2,3,3,3,5)"));
        System.out.println(re.eval("format(list(1,2,3,3,3,5))"));

     //   TimeUnit.SECONDS.sleep(7);


//        re.eval("dev.off()");

//        System.exit(1);
        }
    }

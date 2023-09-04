package day0831_01_threadstram;

public class RunnableThread implements Runnable{

    private int iStart;
    private int iEnd;
    private int iFlag;

    public RunnableThread(int iStart, int iEnd, int iFlag) {
        this.iStart = iStart;
        this.iEnd = iEnd;
        this.iFlag = iFlag;
    }

    @Override
    public void run() {
        long lSum =0;
        for (int i = 0; i < 250000; i++) {
            for (int j = 0; j < 50000; j++) {
                lSum += i*j;
            }

        }
        long lAfterTime = System.currentTimeMillis();
        if(iFlag ==1){

        }
        else if (iFlag==2) {
        }
        else if (iFlag==3){

        }
    }
}


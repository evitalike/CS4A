class StopWatch {
    private long startTime; 
    private long endTime;

    // constructor

    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    /**
     * setStartTime
     * @param sT start time
     */
    public void setStartTime(long sT){
        startTime = sT;
    }
    
    /**
     * setEndTime
     * @param eT end time
     */
    public void setEndTime(long eT){
        endTime = eT;
    }

    // getters

    /**
     * getStartTime
     * @return long start time
     */
    public long  getStartTime() {
        return this.startTime;
    }

    /**
     * getEndTime
     * @return long endTime
     */
    public long getEndTime(){
        return this.endTime;
    }

    /**
     * start
     */
    public void start(){
        setStartTime(System.currentTimeMillis());
    }

    /**
     * stop
     */
    public void stop(){
        setEndTime(System.currentTimeMillis());
    }

    /**
     * elapsedTime
     * @return long elasped time
     */
    public long elapsedTime(){
        return(getEndTime() - getStartTime());
    }
}
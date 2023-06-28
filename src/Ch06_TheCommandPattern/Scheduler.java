package Ch06_TheCommandPattern;

public class Scheduler {

    public static void main(String[] args) {
        WorkerThread[] workerThreads = new WorkerThread[10];
        for(int i = 0 ; i < 10 ; i++){
            workerThreads[i] = new WorkerThread(new Command() {
                @Override
                public void execute() {
                    for(int j = 0 ; j < 5 ; j++)
                        System.out.println(j);
                }

                @Override
                public void undo() {

                }
            });
        }
        for(WorkerThread workerThread : workerThreads)
            workerThread.start();
    }
}

class WorkerThread extends Thread {

    private Command commandToDo;

    public WorkerThread(Command commandToDo){
        this.commandToDo = commandToDo;
    }

    @Override
    public void run(){
        commandToDo.execute();
    }
}

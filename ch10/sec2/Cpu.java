package sec2;

import java.util.List;

// 모든 작업(프로세스)은 CPU에 의존한다.
public class Cpu {

    // 스케줄링 정책에 CPU가 제어가 되므로 스케줄러(Scheduler) 인터페이스가 필요.
    private final Scheduler scheduler;

    // 생성자의 매개변수로 인터페이스가 존재해야함
    public Cpu(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void run(List<Job> jobs) {
        Job job = scheduler.selectJob(jobs);
        System.out.println("CPU 실행 작업: "+job.getName());
    }
}

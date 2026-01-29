package sec2;

import java.util.List;

public class SchedulerExam {
    public static void main(String[] args) {

        List<Job> jobs = List.of(
            new Job("A 프로세스", 5, 1),
            new Job("B 프로세스", 2, 3),
            new Job("C 프로세스", 1, 2)
        );

        Cpu cpu;

        // 생성자에 의한 다형성
        cpu = new Cpu(new RoundRobin());
        cpu.run(jobs);

        cpu = new Cpu(new LeastJob());
        cpu.run(jobs);

        cpu = new Cpu(new PriorityAllocation());
        cpu.run(jobs);
    }
}

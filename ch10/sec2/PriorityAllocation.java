package sec2;

import java.util.List;

// 우선 순위에 의한 스케줄링
public class PriorityAllocation implements Scheduler {

    @Override
    public Job selectJob(List<Job> jobs) {
        return jobs.stream().max((a, b) ->
                        Integer.compare(a.getPriority(),
                                b.getPriority()))
                .orElse(null);
    }
}

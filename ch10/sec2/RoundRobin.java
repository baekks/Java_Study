package sec2;

import java.util.List;

public class RoundRobin implements Scheduler {
    private int index = 0;

    // 배열에서....   리스트에서...
    // jobs.length = jobs.size()
    // 선택된 작업을 리턴
    @Override
    public Job selectJob(List<Job> jobs) {
        if(jobs.isEmpty()) return null;     // 작업목록이 비어있는 경우
        Job job = jobs.get(index);
        index = (index + 1) % jobs.size();  // 작업개수(jobs.size())
        return job;
    }
}

package sec2;

import java.util.List;

// 작업 예상 시간(requiredTime)이 가장 짧은 것 부터
public class LeastJob implements Scheduler {

    // 스트림(비트열): A, B, C
    // A: 3
    // B: 1 => return => null
    // C: 4
    public Job selectJob(List<Job> jobs) {
        return jobs.stream().min((a, b) ->
                Integer.compare(a.getRequiredTime(),
                        b.getRequiredTime()))
                .orElse(null);
    }
}

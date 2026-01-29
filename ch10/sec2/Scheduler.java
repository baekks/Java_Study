package sec2;

import java.util.List;

// 모든 스케줄링의 공통 사항은 작업목록(프로세스 리스트)에서 하나의 작업만 선택하여 실행
public interface Scheduler {
    Job selectJob(List<Job> job);
}

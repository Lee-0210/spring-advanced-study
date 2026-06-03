package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 필드에 전략을 보관하는 방식
 */
@Slf4j
public class ContextV1 {

    private Strategy startegy;

    public ContextV1(Strategy startegy) {
        this.startegy = startegy;
    }

    public void exectue() {
        long startTime = System.currentTimeMillis();
        // 비즈니스 로직 실행
        startegy.call();

        // 비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }
}

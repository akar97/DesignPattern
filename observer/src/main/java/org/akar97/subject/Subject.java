package org.akar97.subject;

import org.akar97.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer); // 옵저버 추가
    public void removeObserver(Observer observer); // 옵저버 삭제
    public void notifyObservers(); // 주제의 상태가 변경 되었을 경우 모든 옵저버를 호출 할 수 있는 메서드
}

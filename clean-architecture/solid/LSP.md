# 리스코프 치환 원칙(LSP: Liskoc Substituion Principle)

리스코프 치환 법칙은 interface로 추상화된 컴포넌트를

치환할 수 있도록 설계하라는 뜻이다.

오해하기 쉽다.

interface에 구현체를 DI하여 사용할때 애초에 interface에 method들을 구현하지 않으면

적어도 내가 본 모든 언어는 에러를 뱉었다.

아키텍쳐를 배우는데 에러를 내지 말라는것이 아니다.


interface의 메서드는 select인데 user구현체에서는 select를 하고 animal구현체에서는 insert를 하지 말라는 뜻이다.

치환 가능성을 위배하면 시스템 아키텍처가 오염되어 무수한 2~3중 if문을 구현해야 할 지도 모른다.
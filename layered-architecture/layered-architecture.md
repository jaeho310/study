# layered architecture

## 아키텍쳐에 대한 의견은 매우 분분합니다.
```
ddd에 종류에 layered architecture, clean architecture, 
```

## 크게 두가지로 나뉩니다.
- 3layered architecture(clean architecture)
- layered architecture(domain driven design)

```
domain driven design이 3layered architecture를 포함한다는 의견도 있습니다.
```

## Clean architecture(3 layered architecture)와 golang
- https://blog.puppyloper.com/menus/Golang/articles/Golang%EA%B3%BC%20Clean%20Architecture
- https://github.com/shharn/golang-clean-architecture

## clean architecture와 domain driven design의 비교
- https://khalilstemmler.com/articles/software-design-architecture/domain-driven-design-vs-clean-architecture/

## 3 tier clean architecture
- https://medium.com/@justfaceit/clean-architecture%EB%8A%94-%EB%AA%A8%EB%B0%94%EC%9D%BC-%EA%B0%9C%EB%B0%9C%EC%9D%84-%EC%96%B4%EB%96%BB%EA%B2%8C-%EB%8F%84%EC%99%80%EC%A3%BC%EB%8A%94%EA%B0%80-1-%EA%B2%BD%EA%B3%84%EC%84%A0-%EA%B3%84%EC%B8%B5%EC%9D%84-%EC%A0%95%EC%9D%98%ED%95%B4%EC%A4%80%EB%8B%A4-b77496744616


## 전자정부 프레임워크에서 사용하는 3계층 Clean Architecture 레이어 방식

1. persentation layer(표현 계층)
    - controller가 해당되며 클라이언트와의 interface 역활을 한다.

2. business layer(비즈니스 로직 계층)
    - service가 해당되며 도메인(model, entitiy, 등) 관련 비즈니스 로직을 둔다.

3. persistence layer(영속성 계층)
    - repository가 해당되며 영속성 저장방식을 추상화 시켜놓은 곳이다.

4. infrastructure layer(인프라 계층)
    - spring의 경우 프레임워크에 의존하여 따로 구현하지 않습니다.
    - 영속성계층과 상호작용하는 계층으로
    - jpa나 mybatis를 사용하여 db에 접근하는 부분
    - sql이 담긴 xml파일이 들어갈 수도 있고 repository 구현체가 될수도 있다.


## DDD에서 소개하는 layered architecture
1. User Interface layer(사용자 인터페이스 레이어)
    - controller가 해당되며 클라이언트와의 interface 역활을 한다.

2. Application layer
    - usecase가 해당되며 어플리케이션의 요구사항을 추상화 해놓은곳
    - usecase의 구현체가 들어가기도 한다.  

3. domain layer
    - usecase의 구현체가 들어오고 model 간의 상호 문맥 교환을 통해 비즈니스 로직을 푼다.
    - 영속성 저장은 추상화하여 infrastructure에 위임한다.   

4. infrastructure layer
    - 외부 시스템과 상호작용하는 계층으로 보통 domain layer에 추상화된 영속성 저장을 담당한다.
    - controller의 route기능을 infra에 넣기도 한다.



참고할 자료들
### https://github.com/pangpanglabs/echosample
    - controllers 디렉토리가 외부와의 interfaces를 담당(presentation layer)
    - model 디렉토리가 application layer와 domain layer를 담당
    - factory 디렉토리가 DB접근을 연결하며 domain layer를 담당하며 echo 프레임워크에 infrastructure의 역할을 위임 middleware에서 불러와서 처리
```
clean architecture와 가깝다.
```

### https://github.com/halkn/echo-sample.git
    - infrastructure 에서 영속성 및 , route 기능등을 담당,
    - interface(presentation layer) 에서 controller 구현, 영속성을 위한 접근등을 구현( domain layer와 infra layer의 인터페이스)
    - usecase 에서 애플리케이션의 요구사항을 추상화, 구현(application과 domain layer)
    - infra영역에서 실제로 기반 기술을 모아놓았고, usecase에 비즈니스 로직을 몰아넣었으며, interface는 infra영역과의 연결을 위한 layer
```
DDD
제어의 역전을 잘 구현해놨으며, 의존성 주입방법을 참고하기 아주 좋다.
```
    

### https://github.com/phodal/layer-architecture
    - DDD에 가까운 예제


### https://github.com/herryg91/go-clean-architecture
    - DDD

### https://github.com/zhashkevych/go-clean-architecture
    - Clean architecture에 가까운 예제


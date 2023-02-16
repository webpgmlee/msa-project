NFT MALL
=============
NFT를 판매하는 쇼핑몰 입니다.<br>
Microservice를 활용한 프로젝트로 Spring cloud, Eureka, Rest Api 기술을 사용하여 구현하였습니다.<br>
자세한 구현 내용은 PR에서 확인하실 수 있습니다.<br>

## 프로젝트의 전체적인 구조
![NFT MALL 서버 구조도](https://user-images.githubusercontent.com/46917538/74079907-fe3e8180-4a80-11ea-90fa-2abb60f7d361.png)
- github hook을 받아 Jenkins에서 CI/CD를 진행합니다.
- 모든 서버는 Naver Cloud Platform에 올라가 있습니다.<br>
- 구동중인 서버 : Main Delfood Server, Redis Server, MariaDB Server
- public IP는 Main Server에만 할당되어 있습니다.


## 프로젝트의 주요 관심사
<b>공통사항</b><br>
- 지속적인 성능 개선
- 나쁜 냄새가 나는 코드에 대한 리팩토링
<br><br>
<b>성능 최적화</b><br>
- 서버 부하를 줄이기 위해 캐싱 서버 적극 활용
- DB서버와의 통신을 최소화(당연한 이야기지만 N+1 쿼리를 지양)
- 인덱스와 쿼리 튜닝을 활용
- 비동기를 활용하여 빠른 시간 내에 외부 API 호출
<br><br>

### 테스트
- Mockito Framework를 활용하여 고립된 테스트 코드를 작성
- Jenkins CI를 적용하여 테스트 자동화
- 협업하는 동료의 소스코드에 서로 테스트코드를 작성하여 서로의 소스코드를 알 수 있도록 하고 있습니다.
<br><br>

### 성능 테스트
NGrinder를 설치하여 테스트하고있습니다.<br>


## 사용 기술 및 환경
Spring boot, Maven, Mybatis, Redis, Docker, MariaDB, Jenkins, Java8, Naver Cloud Platform
<br>

## CI
Jenkins : 서버 운영을 종료하였습니다.<br>
Naver Cloud Platform(Cloud server)를 사용하고 있습니다.<br>
PR시마다 자동 Build 및 Test 적용<br>
비로그인 상태로도 확인이 가능합니다.<br>

## CD
Docker 이미지를 제작하여 배포합니다.<br>
CI 서버에서 빌드 완료시 Shell script가 작동하여 빌드된 이미지가 docker hub에 저장됩니다.<br>
Push 완료시 Delfood 메인 서버에서 docker hub에 올라간 이미지를 받아 실행시킵니다.<br>

<br>
## Database
- MariaDB<br>
cafe24 web hosting 서비스를 사용하고 있습니다.
- Redis<br>
docker 컨테이너를 사용하고 있습니다.
<br>

## 프로젝트 DB ERD
2019-11-08 수정 (쿠폰 스키마 추가)
![배달의민족_20191108_33_53](https://user-images.githubusercontent.com/46917538/68458221-9429fc80-0245-11ea-9cc3-92f7a35fd534.png)

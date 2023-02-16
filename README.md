NFT MALL
=============
NFT를 판매하는 쇼핑몰 입니다.<br>
Microservice를 활용한 프로젝트로 Spring cloud, Eureka, Rest Api 기술을 사용하여 구현하였습니다.<br>
자세한 구현 내용은 PR에서 확인하실 수 있습니다.<br>

## 프로젝트의 전체적인 구조
![NFT MALL 서버 구조도](https://github.com/webpgmlee/msa-project/blob/master/System.png)
)
- 각 Rest Api는 EurekaClient로 EurekaServer에서 관리하고 있습니다.
- API GATEWAY는 Eureka Discovery Client로 Eureka Server에 등록되어<br>
Client의 요청을 Eureka Server에 등록된 Rest Api와 매핑해는 역할을 수행하고 있습니다.

## 프로젝트의 주요 관심사
<b>공통사항</b><br>
- e-commerce에 맞는 기능 추가
- Rest Api를 추가하여 Load Balancing을 활용한 성능 향상


## 사용 기술 및 환경
Spring boot, Maven, JPA, Mysql, Java11, Vue.js, Intellij, VsCode
<br>

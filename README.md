# 🧊 *term b/ur (텀블러)*
> 내 손 안의 흐려지는 단어장, 'term b/ur' 는 자신이 단어를 얼마나 잘 암기했는지 객관적으로 파악할 수 없는 불편한 문제점을 흐려짐을 통해 쉽고 직관적으로 암기 정도를 파악할 수 있도록 도움을 주는 모바일 서비스입니다.
<img width="936" alt="image" src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/150939763/1d383f19-d6f6-462a-b6bf-24da39f87ea1">

<br/>
<br/>

# 🧊 목적 및 필요성
<img width="936" alt="image" src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/150939763/7e0f8d7d-2e28-4049-8b2d-f232e0d9cb2c">
<img width="936" alt="image" src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/150939763/de275c55-6748-4d72-9fae-2b8e2040c492">
<img width="936" alt="image" src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/150939763/fec9fade-3c8a-4511-95c7-d0836ace561b">
<img width="936" alt="image" src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/150939763/e2497478-afb4-42a4-a9a3-7160a21b85f8">

<br/>
<br/>

# 🧊 서비스 소개
<img width="935" alt="image" src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/150939763/3f9b2af5-e580-4602-90c4-3f25d3f99689">
<img width="936" alt="image" src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/150939763/7de99edd-dfdd-440d-b4a1-15ff0c5be9d4">

<br/>
<br/>


# Back-end (Spring 🌱)
| <img src="https://avatars.githubusercontent.com/u/81475587?v=4" width=300px alt="서버/김창균"/>  | <img src="https://avatars.githubusercontent.com/u/150939763?v=4" width=300px alt="서버/정정교"/>
| :-----: | :-----: |
| [김창균/ckkim817](https://github.com/ckkim817) | [정정교/Junggyo1020](https://github.com/junggyo1020) 

<br/>

## 💡 Git Convention
> **Git Flow**
> 
- `main` : 배포 프랜치
- `develop` : 개발 브랜치
- `type/#이슈번호` : 세부 개발 브랜치
    - 생성한 이슈번호로 브랜치를 생성한다.
    - ex) feat/#20
- PR 머지 후 해당 브랜치는 삭제한다.
<br/>

## 📌 Commit Convention
### Commit 메세지
```text
[type/#이슈번호]: 작업내용

ex) [feat/#20]: 검색 결과 필터링 기능 추가
```
<br/>

### Branch 이름
```text
type/#이슈번호

ex) feat/#20
```
<br/>

### Branch 종류
| Type | 의미 |
| --- | --- |
| ✨ FEAT | 새로운 기능 추가 |
| 🔨 FIX | 버그, 오류 수정 |
| ✅ CHORE | 동작에 영향 없는 코드 or 변경 없는 변경사항(주석 추가 등)  ex) .gitIgnore |
| 📝 DOCS  | README나 WIKI 등의 문서 수정 |
| ♻️ REFACTOR | 코드 리팩토링 |
| ✏️ CORRECT  | 주로 문법의 오류나 타입의 변경, 이름 변경시 |
| ⚰️ DEL  | 쓸모없는 코드 삭제 |
| ⏪️ RENAME | 파일 이름 변경시 |
| 🔀 MERGE | 다른 브랜치와 병합 |
| 💡Test | 테스트 코드, 리팩토링 테스트 코드 추가  |
| ✒️ Comment | 필요한 주석 추가 및 변경 |
| 📂 File | 파일 또는 폴더명 수정, 이동, 삭제 등의 작업만 수행한 경우 |
| 🔥 !HOTFIX | 급하게 치명적인 버그를 고쳐야 하는 경우 |

<br/>

## 📌 Code Convention
> **네이밍 규칙**
>
- `lowerCamelCase` 사용
  - 클래스, 인터페이스, db스키마의 경우 `UpperCamelCase`
- 함수명 : 동사+명사
  - API와 직결되는 함수는 CRUD 명칭을 앞에 달기
    - ex. Create → create000
      Read → get000 (getUserById, getUsers)
      Update → update000
      Delete → delete000
- 변수명 : 명사+명사 or 형용사+명사
- 명사는 단수로 쓰지 않되 개수를 나타내는 단어 꼭 적어주기
  - ex. 복수 : getUsers() / 단수 : getUser()

<br/>

> **그 외 코드 작성 시 유의 사항**
>
- **Exception**
  - 서비스 로직에 관련된 예외는 서비스 단에서 던지기
  - validation 관련 예외는 컨트롤러 단에서 던지기
- **Type Assertion**
  - type 지정 필수
    - 변수, 함수 모두
  - 서비스 단에서 스키마와 관련된 변수 및 함수 타입 단언은 경우의 따라 단언을 하지 않을 수 있다.
- **주석 작성 시 띄어쓰기 넣기**

    ```java
    // 이렇게
    
    /**
     * 여기에 이렇게 합시다
     */
    ```

<br/>

> **들여쓰기 및 띄어쓰기**
>
- 들여쓰기에는 탭(tab) 대신 **4개의 space**를 사용합니다.
- 클래스 내 변수는 한 줄 공백을 두고 작성합니다.

<br/>

> **줄바꿈**
>
- 함수 정의가 `**매개변수의 개수가 3개를 초과하는 경우**`에는 아래와 같이 줄바꿈합니다.

    ```java
    public static UserResponseDto of(Long id, String nickName, Rank userRank, int point, 
    		                 int coupon, long interest, int waiting, int finish,
    		                 int ready, int delivering, int delivered,
    ){
        ...
    }
    ```
  
<br/>

> **Code Review**
>
- 커뮤니케이션 비용을 줄이기 위한 Pn 룰

  • P1: 꼭 반영해주세요 (Request changes)

  • P2: 적극적으로 고려해주세요 (Request changes)

  • P3: 웬만하면 반영해 주세요 (Comment)

  • P4: 반영해도 좋고 넘어가도 좋습니다 (Approve)

  • P5: 그냥 사소한 의견입니다 (Approve)

<br/>

## 💡 API 명세서
https://rowan-octopus-031.notion.site/NOW-Sopkathon-IOS-4-c9f05ece2cd44427b696ebcd25037ec0?pvs=4

<br/>

## 📂 Structure
```text
├── build.gradle
└── 📂 src/main/java/org/sopkathon
        ├── 📂 config // Config 관련 파일 구현
        ├── 📂 controller // 컨트롤러
        ├── 📂 domain // 도메인
        │       ├── 📂 common // 공통 도메인 관련 파일 ex) BaseEntity
        │       ├── 📂 enums // 도메인 관련 enum 파일
        │       └── 📂 mapping // 도메인 관련 매핑 테이블
        │  
        ├── 📂 dto
        │       ├── 📂 request // requestDto 구현
        │       └── 📂 response // responseDto 구현
        │
        ├── 📂 exception
        │       ├── 📂 dto // ex) ErrorResponse, SuccessResponse
        │       ├── 📂 enums // ex) ErrorMessage, SuccessMessage
        │       ├── CustomException.java
        │       └── GlobalExceptionHandler.java
        │ 
        ├── 📂 repository // 레포지토리
        │  
        ├── 📂 service // 서비스 로직
        │
        └── SopkathonApplication.java
```
<br/>

## 📒 ERD
<img width="714" alt="image" src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/81475587/90a6e0aa-731d-430e-91c0-95c4ead4562c">

<br/>

## 📷 Photo
### 솝커톤 사진
| <img src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/150939763/0b1ea0ff-45cd-402b-b426-8885defe4a0d" width=500px alt="서버 사진"/>  | <img src="https://github.com/SOPKATHON-iOS-TEAM4/SERVER/assets/150939763/2c833608-efcb-442e-99c0-872826c29385" width=500px alt="팀 사진"/>
| :-----: | :-----: |

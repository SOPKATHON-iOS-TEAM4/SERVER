## 💡 SOPKATHON_IOS_TEAM4
> NOW SOPT 34th SOPKATHON 모바일 앱 4팀입니다.
<br/>


##  Back-end (Spring 🌱)
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

## 📂 Structure
```elixir
├── build.gradle
└── 📂 src/main/java/org/sopkathon
        ├── 📂 config
        ├── 📂 controller
        ├── 📂 domain
        │       ├── 📂 common 
        │       ├── 📂 enums 
        │       └── 📂 mapping // 매핑테이블
        │  
        ├── 📂 dto
        │       ├── 📂 request
        │       └── 📂 response 
        │
        ├── 📂 exception
        │       ├── 📂 dto
        │       ├── 📂 enums
        │       ├── CustomException.java
        │       └── GlobalExceptionHandler.java
        │ 
        ├── 📂 repository
        │  
        ├── 📂 service 
        │
        └── SopkathonApplication.java
```


---
## 1주차 : 스프링 부트 개발환경, 테스트 완료 

- 개발 환경 설정 : [완료](https://github.com/jeky05/SPRING_20240866/commit/df796de8c3242303ed0ac454284d4019aee1a25b)

  -  해당 파일 : [index.html](https://github.com/jeky05/SPRING_20240866/blob/df796de8c3242303ed0ac454284d4019aee1a25b/src/main/resources/templates/index.html)

- 동작 과정 및 메인 페이지 : [완료](https://github.com/jeky05/SPRING_20240866/commit/1eb41d2114439cbd78890a6156fc93a1bd09fe4f)

  - 해당 파일 :
    - [DemoController.java](https://github.com/jeky05/SPRING_20240866/blob/1eb41d2114439cbd78890a6156fc93a1bd09fe4f/src/main/java/com/example/demo/DemoController.java)
    - [index.html](https://github.com/jeky05/SPRING_20240866/blob/1eb41d2114439cbd78890a6156fc93a1bd09fe4f/src/main/resources/templates/index.html)
    - [hello.html](https://github.com/jeky05/SPRING_20240866/blob/1eb41d2114439cbd78890a6156fc93a1bd09fe4f/src/main/resources/templates/hello.html)

- 연습문제 : [URL 맵핑과 컨트롤러 추가하기](https://github.com/jeky05/SPRING_20240866/commit/2fab67b0e283c09f31f5b3f1b109dfbbbab60620)
  - 해당 파일 :
    - [DemoController.java](https://github.com/jeky05/SPRING_20240866/blob/2fab67b0e283c09f31f5b3f1b109dfbbbab60620/src/main/java/com/example/demo/DemoController.java)
    - [index.html](https://github.com/jeky05/SPRING_20240866/blob/2fab67b0e283c09f31f5b3f1b109dfbbbab60620/src/main/resources/templates/index.html)
    - [hello.html](https://github.com/jeky05/SPRING_20240866/blob/2fab67b0e283c09f31f5b3f1b109dfbbbab60620/src/main/resources/templates/hello.html)
    - [hello2.html](https://github.com/jeky05/SPRING_20240866/blob/2fab67b0e283c09f31f5b3f1b109dfbbbab60620/src/main/resources/templates/hello2.html)

---

## 2주차 : 포트폴리오 기본 세팅 완료 

- 포트폴리오로 변경(ProMan) : [완료(index.html)](https://github.com/jeky05/SPRING_20240866/blob/bb5afc7874534016f2b73204ee25dcae8eb1646e/src/main/resources/templates/index.html)

---

## 3주차 : 포트폴리오 작성하기 완료 

- 상세 페이지 생성
  - 해당 파일 :
    - [DemoController.java](https://github.com/jeky05/SPRING_20240866/blob/bb5afc7874534016f2b73204ee25dcae8eb1646e/src/main/java/com/example/demo/DemoController.java)
    - [about_detailed.html](https://github.com/jeky05/SPRING_20240866/blob/c7166727c98063691c3a286296288a219b772d30/src/main/resources/templates/about_detailed.html) 

- 연습 문제 : [상세 페이지 수정하기](https://github.com/jeky05/SPRING_20240866/commit/fb3f1c3c50e62395c11051d11de4b4594faeeee6)
  - 해당 파일 :
    - [static/main.js](https://github.com/jeky05/SPRING_20240866/blob/fb3f1c3c50e62395c11051d11de4b4594faeeee6/src/main/resources/static/js/main.js)
    - [about_detailed.html](https://github.com/jeky05/SPRING_20240866/blob/fb3f1c3c50e62395c11051d11de4b4594faeeee6/src/main/resources/templates/about_detailed.html)

---

## 4주차 : 데이터베이스 연동 및 테스트 
> 5주차 내용과 동일한 커밋을 공유하고 있음 - [4주차+5주차 커밋](https://github.com/jeky05/SPRING_20240866/commit/d341ecc99ad24c4697806a7d804352292cbdd672#diff-457e64d5ec6a16a54e16a31bd3ca300ad324186761f4b82e67895e7a0ff96b8b)

- 프로필 수정 : [index.html](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/resources/templates/index.html)
- 데이터베이스 연동 :
  - 해당 파일 :
    - [pom.xml(Spring Data JPA, database, SQL 모듈 주석처리 해제)](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/pom.xml)
    - [application.properties(MySql 접속 정보 추가)](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/resources/application.properties)

- 구조 변경
  
- 테스트 페이지
  - 해당 파일 :
    - 엔티티 클래스 추가 : [domain/TestDB.java](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/java/com/example/demo/model/domain/TestDB.java)
    - 리포지토리 클래스 추가 : [TestRepository.java](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/java/com/example/demo/model/repository/TestRepository.java)
      > 리포지토리 : jpa 상속받아 데이터 제어(CRUD) 기능을 자동 제공
    - 서비스 클래스 추가 : [TestService.java](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/java/com/example/demo/model/service/TestService.java)
    - 컨트롤러(5주차와 섞여짐) : [DemoController.java](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/java/com/example/demo/controller/DemoController.java)

- 연습 문제 : [사용자 추가 및 출력하기](https://github.com/jeky05/SPRING_20240866/commit/8d04b36f4b46134d38ff2e9e490e3423bdb845cb)
  - 해당 파일 :
    - [DemoController.java](https://github.com/jeky05/SPRING_20240866/blob/8d04b36f4b46134d38ff2e9e490e3423bdb845cb/src/main/java/com/example/demo/controller/DemoController.java)
    - [testdb.html](https://github.com/jeky05/SPRING_20240866/blob/8d04b36f4b46134d38ff2e9e490e3423bdb845cb/src/main/resources/templates/testdb.html)

--- 

## 5주차 : 블로그 게시판 - 1 
> 4주차, 6주차 커밋과 동일한 커밋을 공유하고 있음 : [4주차+5주차 커밋](https://github.com/jeky05/SPRING_20240866/commit/d341ecc99ad24c4697806a7d804352292cbdd672) / [5주차+6주차 커밋](https://github.com/jeky05/SPRING_20240866/commit/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f)
- 프로필 수정하기
  - 해당 코드 : `<a href="/article_list" class="navbar-brand bg-secondary py-3 px-4 mx-3 d-none d-lg-block" target="_blank">`
    
- 블로그 게시판(조회)
  - 해당 파일 : 
    - 블로그 게시판 작성하기 : [article_list.html](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/resources/templates/article_list.html)
    - 블로그 게시판 등록하기 + 컨트롤러 클래스 추가 : 
      ```
      @GetMapping("/article_list")
      public String article_list() {
      public String article_list(Model model) {
          List<Article> list = blogService.findAll();
          model.addAttribute("articles", list);
          return "article_list";
      }
      ```
    - 엔티티 클래스 추가 : [domain/Article.java](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/java/com/example/demo/model/domain/Article.java)
    - 리포지토리 클래스 추가 : [BlogRepository.java](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/java/com/example/demo/model/repository/BlogRepository.java)
    - 서비스 클래스 추가 : [BlogService.java](https://github.com/jeky05/SPRING_20240866/blob/d341ecc99ad24c4697806a7d804352292cbdd672/src/main/java/com/example/demo/model/service/BlogService.java)
      
- 블로그 게시판(글쓰기)
  - 해당 파일 :
    - 글쓰기 화면 및 버튼 추가(게시글 추가 폼) : [article_list.html](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/resources/templates/article_list.html)
    - 컨트롤러 클래스 추가 : [BlogRestController.java](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/java/com/example/demo/controller/BlogRestController.java)
    - 서비스 클래스 추가 : [AddArticleRequest.java](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/java/com/example/demo/model/service/AddArticleRequest.java)

- 연습문제 : [페이지 리다이렉트](https://github.com/jeky05/SPRING_20240866/commit/e689096d8d6793dc46a0026569c0344827fcc359)
  - 해당 파일 :
    - 컨트롤러 : BlogController.java
      ```
       @PostMapping("/api/articles")
        public String addArticle(@ModelAttribute AddArticleRequest request) {
        blogService.save(request);
        return "redirect:/article_list";
      }
      ```

## 6주차 : 블로그 게시판 - 2 
> 5주차 커밋과 동일한 커밋을 공유하고 있음 : [5주차+6주차 커밋](https://github.com/jeky05/SPRING_20240866/commit/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f)
- 게시글 수정/삭제 버튼 추가 (중첩 조합 - 동적 링크) : [article_edit.html](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/resources/templates/article_edit.html)
  ```
  <a class="btn btn-warning" th:href="@{/articles_edit/{id}(id=${article.id}}">수정</a>
  <a class="btn btn-warning" th:href="@{/articles_edit/{id}(id=${article.id}}">삭제</a>
  ```
- 블로그 게시판(수정)
  - 해당 파일 :
    - 컨트롤러 클래스 추가 : [BlogController.java](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/java/com/example/demo/controller/BlogController.java)
      - 게시글 수정 페이지로 이동
      ```
      @GetMapping("/article_edit/{id}") //게시판 링크 지정
      public String article_edit(Model model, @PathVariable Long id) {
          Optional<Article> list = blogService.findById(id); //선택한 게시글
  
          if (list.isPresent()) { //존재하면
              model.addAttribute("article", list.get()); //객체를 모델에 추가
          } else {
              return "/error_page/article_error"; //오류 페이지로 이동
          }
          return "article_edit"; //.html 연결
      }
      ```
      - 게시글 수정 기능
      ```
      @PutMapping("/api/article_edit/{id}") //PUT은 다수 요청에 대해 동일한 결과, 동일 데이터 수정
      public String updateArticle(@PathVariable Long id, @ModelAttribute AddArticleRequest request) {
          blogService.update(id, request);
          return "redirect:/article_list"; //글 수정 이후 .html 연결
      }
      ```
      
    - 게시글 수정 페이지 : [article_edit.html](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/resources/templates/article_edit.html)
    - 서비스 클래스 추가 : [BlogService.java](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/java/com/example/demo/model/service/BlogService.java)
      ```
      public Optional<Article> findById(Long id) { //특정 게시글 조회
        return blogRepository.findById(id);
      }
  
      public void update(Long id, AddArticleRequest request) {
          Optional<Article> optionalArticle = blogRepository.findById(id); //단일 글 조회
          optionalArticle.ifPresent(article -> { //값이 있으면
              article.update(request.getTitle(), request.getContent()); //값을 수정
              blogRepository.save(article); //객체에 저장
          });
      }
      ```
    - 엔티티 클래스 수정 : [Article.java](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/java/com/example/demo/model/domain/Article.java)
      ```
      public void update(String title, String content) { //현재 객체 업데이트
        this.title = title;
        this.content = content;
      }
      ```
    - 애플리케이션 설정 추가 : [application.properteis](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/resources/application.properties)
      ```
      // html 기본 폼 전송은 get/post 두가지만 지원, but 게시글 글 수정 요청은 put 메소드기 때문에 설정 필요
      spring.mvc.hiddenmethod.filter.enabled=true
      ```
- 블로그 게시판(삭제)
  - 해당 파일 :
    - 컨트롤러 클래스 수정 : [BlogController.java](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/java/com/example/demo/controller/BlogController.java)
      ```
      @DeleteMapping("/api/article_delete/{id}")
      public String deleteArticle(@PathVariable Long id) {
          blogService.delete(id);
          return "redirect:/article_list";
      }
      ```
    - 서비스 클래스 추가 : [BlogService.java](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/java/com/example/demo/model/service/BlogService.java)
      ```
      public void delete(Long id) {
        blogRepository.deleteById(id);
      }
      ```
    - 게시글 삭제 버튼 : [article_list.html](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/resources/templates/article_list.html)
      ```
      <form th:action="@{/api/article_delete/{id}(id=${article.id})}" method="post" style="display:inline;">
        <input type="hidden" name="_method" value="delete">
        <button type="submit" class="btn btn-danger">삭제</button>
      </form>

- 에러 페이지 : [article_error.html](https://github.com/jeky05/SPRING_20240866/blob/7efe12a3e3c6aabebe3b0f5e9db2363a92f3346f/src/main/resources/templates/error_page/article_error.html)

- 연습문제 : [예외처리](https://github.com/jeky05/SPRING_20240866/commit/5114b84386710e4df0682e80784db968df48e5f7)
  - 컨트롤러 : [BlogController.java](https://github.com/jeky05/SPRING_20240866/blob/5114b84386710e4df0682e80784db968df48e5f7/src/main/java/com/example/demo/controller/BlogController.java)
    ```
    import org.springframework.web.bind.annotation.ControllerAdvice;
    @ControllerAdvice
    ...
    @ExceptionHandler(NumberFormatException.class) // 링크의 매개변수가 정수가 아닌 문자열일 때의 오류
    public String handleNumberFormatException() {
        return "/error_page/article_idError";
    }
    ```
---

## 7주차 : 블로그 게시판 - 3
>[수업 후 커밋](https://github.com/jeky05/SPRING_20240866/commit/92457a3efcad9e5181338b7a10b78a220e57b26a)

- 새 게시판 : [board_list.html](https://github.com/jeky05/SPRING_20240866/blob/92457a3efcad9e5181338b7a10b78a220e57b26a/src/main/resources/templates/board_list.html)
  ```
  <tr th:each="board : ${boards}">
      <td th:text="${board.id}"></td>
      <td>
          <a th:href="@{/board_view/{id}(id=${board.id})}">
              <span th: th:text="${board.title}"></span> // 이거 때문에 오류남. 해결 과정은 뒤에 써놓음
          </a>
      </td>
      <td th:text="${board.user}"></td>
      <td th:text="${board.newdate}"></td>
      <td th:text="${board.count}"></td>
      <td th:text="${board.likec}"></td>
  </tr>
  ```
- 게시판 조회 :
  - 해당 파일 :
    - 컨트롤러 등록 : [BlogController.java](https://github.com/jeky05/SPRING_20240866/blob/92457a3efcad9e5181338b7a10b78a220e57b26a/src/main/java/com/example/demo/controller/BlogController.java)
      ```
      @GetMapping("/board_list") //게시판 링크 지정
      public String board_list(Model model) {
          List<Board> list = blogService.findAll(); //전체 게시글 
          model.addAttribute("boards", list); //모델에 추가
          return "board_list"; //.HTML 연결
      }
      
      @GetMapping("/board_view/{id}") //게시글 링크 지정
      public String board_view(Model model, @PathVariable Long id) {
          Optional<Board> list = blogService.findById(id); //선택한 게시글
  
          if (list.isPresent()) {
              model.addAttribute("board", list.get()); //존재하면 모델에 추가
          } else {
              return "/error_page/article_error";
          }
          return "board_view"; //.HTML 연결
      }
      ```
      
    - DB 추가 : [Board.java](https://github.com/jeky05/SPRING_20240866/blob/92457a3efcad9e5181338b7a10b78a220e57b26a/src/main/java/com/example/demo/model/domain/Board.java)

      ```
      @Builder //새로운 필드 : 작성자, 작성일, 조회수, 좋아요
      public Board(String title, String content, String count, String user, String likec, String newdate) {
          this.title = title;
          this.content = content;
          this.count = count;
          this.user = user;
          this.likec = likec;
          this.newdate = newdate;
      }
      
      public void update(String title, String content, String count, String user, String likec, String newdate) {
        this.title = title;
        this.content = content;
        this.count = count;
        this.user = user;
        this.likec = likec;
        this.newdate = newdate;
      }
      ```
      
    - 리포지토리 연동 : [BoardRepository.java](https://github.com/jeky05/SPRING_20240866/blob/92457a3efcad9e5181338b7a10b78a220e57b26a/src/main/java/com/example/demo/model/repository/BoardRepository.java)

      ```
      public interface BoardRepository extends JpaRepository<Board, Long> {
          List<Board> findAll();
      }
      ```
      
    - 서비스 수정 : [BlogService.java](https://github.com/jeky05/SPRING_20240866/blob/92457a3efcad9e5181338b7a10b78a220e57b26a/src/main/java/com/example/demo/model/service/BlogService.java)
      ```
      private final BoardRepository blogRepository; //리포지토리 선언
      
      public List<Board> findAll() { //전체 게시글 조회
        return blogRepository.findAll();
      }
  
      public Optional<Board> findById(Long id) { //특정 게시글 조회
          return blogRepository.findById(id);
      }
      ```
    - 글 내용 보기 페이지 : [board_view.html](https://github.com/jeky05/SPRING_20240866/blob/92457a3efcad9e5181338b7a10b78a220e57b26a/src/main/resources/templates/board_view.html)
      ```
      <table class ="table table-bordered">
                <thread>
                    <tr>
                        <th>글내용</th>
                    </tr>
                </thread>
                <tbody>
                    <tr th:each="board : ${boards}">
                        <td th:text="${board.content}"></td>
                    </tr>
                    <tr th:each="board : ${boards}">
        ```
- 에러 해결 :
  - [templteinputexception 에러: board_list.html ](https://github.com/jeky05/SPRING_20240866/commit/1d04423dc7dfa6fc029a42a84ae50423c22b8fa6#diff-b5224ea0495c6f63a00fa265bd13342ff4a6d885a1400a9a273529be86f818fa) 

  - [DataIntegrityViolationException (제목 데이터 안뜨고 null 취급되는 오류) : 링크를 th:text로 바꾼게 원인](src/main/resources/templates/board_edit.html) 

- 연습문제 : [글 수정](https://github.com/jeky05/SPRING_20240866/pull/1/commits/76fcce94947718d057f292b1bb59ac94e6a97fd4#diff-c6bbfba13350440f5863734e00b0259e365bf8fe0473e033b916693c18efb81a)
  - 글 수정 화면 구성 : [board_edit.html](https://github.com/jeky05/SPRING_20240866/blob/76fcce94947718d057f292b1bb59ac94e6a97fd4/src/main/resources/templates/board_edit.html)
  - 서비스 로직 수정 : [AddArticleRequest.java](https://github.com/jeky05/SPRING_20240866/blob/76fcce94947718d057f292b1bb59ac94e6a97fd4/src/main/java/com/example/demo/model/service/AddArticleRequest.java)
    
    ```
    public Board toEntity() {
        return Board.builder()
                .title(title)
                .content(content)
                .vcount(vcount)
                .user(user)
                .likec(likec)
                .newdate(newdate)
                .build();
    }
    ```

  - 서비스 로직 수정(2) : [BlogService.java](https://github.com/jeky05/SPRING_20240866/blob/76fcce94947718d057f292b1bb59ac94e6a97fd4/src/main/java/com/example/demo/model/service/BlogService.java)
    
    ```
    public void update(Long id, AddArticleRequest request) {
        Optional<Board> optionalBoard = blogRepository.findById(id);
        optionalBoard.ifPresent(board -> {
            board.update(request.getTitle(), request.getContent(), board.getVcount(), board.getUser(),
                    board.getLikec(), board.getNewdate());
            blogRepository.save(board);
        });
    }
    ```

  - 컨트롤러 수정 : [BlogController.java](https://github.com/jeky05/SPRING_20240866/blob/76fcce94947718d057f292b1bb59ac94e6a97fd4/src/main/java/com/example/demo/controller/BlogController.java)
    ```
    @GetMapping("/board_edit/{id}") // 수정페이지로 이동
    public String board_edit(Model model, @PathVariable Long id) {
        Optional<Board> list = blogService.findById(id);

        if (list.isPresent()) {
            model.addAttribute("board", list.get());
        } else {
            return "/error_page/article_error";
        }
        return "board_edit";
    }
    
    @PutMapping("/api/board_edit/{id}") // 수정 적용 
    public String updateBoardEdit(@PathVariable Long id, @ModelAttribute AddArticleRequest request) {
        blogService.update(id, request);
        return "redirect:/board_list";
    }
    ```
---

## 9주차 : 게시판 - 검색과 페이징
> [커밋](https://github.com/jeky05/SPRING_20240866/commit/08bb85f24b9d6952dc86c2f11cbc052674f214e9)

- 게시판 링크 변경 : [index.html](https://github.com/jeky05/SPRING_20240866/blob/08bb85f24b9d6952dc86c2f11cbc052674f214e9/src/main/resources/templates/index.html)
  <img width="2172" height="681" alt="스크린샷 2025-12-14 225321" src="https://github.com/user-attachments/assets/e87b7c70-b007-4580-8d83-b1301520f118" />

- 글쓰기 기능 :
  - 글쓰기 버튼 추가 : [board_list.html](https://github.com/jeky05/SPRING_20240866/blob/08bb85f24b9d6952dc86c2f11cbc052674f214e9/src/main/resources/templates/board_list.html)

    ```
    <td><!--글쓰기버튼-->
        <a class="btn btn-warning" th:href="@{/board_write}">글쓰기</a>
    </td>
    ```

  - 글쓰기 페이지, 글쓰기 저장 맵핑 : [BlogController.java](https://github.com/jeky05/SPRING_20240866/blob/08bb85f24b9d6952dc86c2f11cbc052674f214e9/src/main/java/com/example/demo/controller/BlogController.java)
    
    ```
    @GetMapping("/board_write") //글쓰기 페이지로 이동
    public String board_write() {
        return "board_write";
    }
    
    @PostMapping("/api/boards") //게시글 저장
    public String addBoard(@ModelAttribute AddArticleRequest request) {
        blogService.save(request);
        return "redirect:/board_list";
    }
    ```

  - 글쓰기 페이지 추가 : [board_write.html](https://github.com/jeky05/SPRING_20240866/blob/08bb85f24b9d6952dc86c2f11cbc052674f214e9/src/main/resources/templates/board_write.html)

  - 서비스 추가 : [BlogService.java](https://github.com/jeky05/SPRING_20240866/blob/08bb85f24b9d6952dc86c2f11cbc052674f214e9/src/main/java/com/example/demo/model/service/BlogService.java)
 
  ```
  public Board save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
  ```  

- 검색창 페이징 : [커밋](https://github.com/jeky05/SPRING_20240866/commit/7a98ff4c327070d703b7c783a330999aa9ae2cf0)
  - 검색창 화면 : [board_list.html](https://github.com/jeky05/SPRING_20240866/blob/08bb85f24b9d6952dc86c2f11cbc052674f214e9/src/main/resources/templates/board_list.html)
    ```
    <div class="input-group">
        <input type="text" class="form-control" placeholder="검색어를 입력하세요" name="keyword" th:value="${keyword}">
        <button class="btn btn-outline-secondary" type="submit">검색</button>
    </div>
    ```

  - 페이징 화면 : [board_list.html(https://github.com/jeky05/SPRING_20240866/blob/7a98ff4c327070d703b7c783a330999aa9ae2cf0/src/main/resources/templates/board_list.html)
    ```
    <!--페이지이동 네비바-->
        <nav aria-label="Page navigation">
            <ul class="pagination justify-content-center">
                <li class="page-item" th:classappend="${currentPage == 0} ? 'disabled'">
                    <a class="page-link" th:href="@{/board_list(page=${currentPage - 1}, keyword=${keyword})}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li class="page-item" th:each="i : ${#numbers.sequence(0, totalPages - 1)}" th:classappend="${i==currentPage} ? 'active'">
                    <a class="page-link" th:href="@{/board_list(page=${i}, keyword=${keyword})}" th:text="${i+1}">1</a>
                </li>
                <li class="page-item" th:classappend="${currentPage + 1 >= totalPages} ? 'disabled'">
                    <a class="page-link" th:href="@{/board_list(page=${currentPage + 1}, keyword=${keyword})}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    ```

    
  - 컨트롤러 : [BlogController.java](https://github.com/jeky05/SPRING_20240866/blob/7a98ff4c327070d703b7c783a330999aa9ae2cf0/src/main/java/com/example/demo/controller/BlogController.java)
    ```
    @GetMapping("/board_list") // 게시글 목록 페이지 이동
    public String board_list(Model model, @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "") String keyword) {
        PageRequest pageable = PageRequest.of(page, 3); //한 페이지의 게시글 수 : 3
        Page<Board> list; //Page 반환

        if (keyword.isEmpty()) {
            list = blogService.findAll(pageable); // 기본셋 출력
        } else {
            list = blogService.searchByKeyword(keyword, pageable); //키워드로 검색
        }
        model.addAttribute("boards", list); // 모델에 추가
        model.addAttribute("totalPages", list.getTotalPages()); //페이지 크기
        model.addAttribute("currentPage", page); //페이지 번호
        model.addAttribute("keyword", keyword); //키워드

        return "board_list";

    }
    ```

  - 서비스 : [BlogService.java](https://github.com/jeky05/SPRING_20240866/blob/7a98ff4c327070d703b7c783a330999aa9ae2cf0/src/main/java/com/example/demo/model/service/BlogService.java)

    ```
    public Page<Board> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    public Page<Board> searchByKeyword(String keyword, Pageable pageable) {
        {
            return blogRepository.findByTitleContainingIgnoreCase(keyword, pageable);
        }
    }
    ```

  - 리포지토리 : [BoardRepository.java](https://github.com/jeky05/SPRING_20240866/blob/7a98ff4c327070d703b7c783a330999aa9ae2cf0/src/main/java/com/example/demo/model/repository/BoardRepository.java)

    ```
    public interface BoardRepository extends JpaRepository<Board, Long> {
        Page<Board> findByTitleContainingIgnoreCase(String title, Pageable pageable);
    }
    ```
    
- 연습문제
  - 연습문제1 : [글 번호](https://github.com/jeky05/SPRING_20240866/commit/ac32b66cd88db3797911bd677aa8906a1d07733f)
    - 컨트롤러 : [BlogController.java](https://github.com/jeky05/SPRING_20240866/blob/ac32b66cd88db3797911bd677aa8906a1d07733f/src/main/java/com/example/demo/controller/BlogController.java)

      ```
      int startNum = (page * 3) + 1; //페이지 별 시작 번호
      model.addAttribute("startNum", startNum); //모델에 추가
      ```

    - 게시글 id -> 번호 : [board_list.html](https://github.com/jeky05/SPRING_20240866/blob/ac32b66cd88db3797911bd677aa8906a1d07733f/src/main/resources/templates/board_list.html)

      ```
      <tr th:each="board,state : ${boards}"> //state는 0부터 시작
                        <td th:text="${startNum+ state.index}"></td> //state.index는 thmeleaf가 제공하는 루프 상태 객체
      ```
  - 연습문제2 : [글 삭제(7주차에 수정 기능이랑 함께 완성) ](https://github.com/jeky05/SPRING_20240866/commit/92457a3efcad9e5181338b7a10b78a220e57b26a)
    - 컨트롤러 : [BlogController.java](https://github.com/jeky05/SPRING_20240866/blob/92457a3efcad9e5181338b7a10b78a220e57b26a/src/main/java/com/example/demo/controller/BlogController.java)
      ```
      @DeleteMapping("/api/board_delete/{id}")
      public String deleteBoard(@PathVariable Long id) {
          blogService.delete(id);
          return "redirect:/board_list";
      }
      ```

    - 서비스 : [BlogService.java](https://github.com/jeky05/SPRING_20240866/blob/92457a3efcad9e5181338b7a10b78a220e57b26a/src/main/java/com/example/demo/model/service/BlogService.java)
      ```
      public void delete(Long id) {
          blogRepository.deleteById(id);
      }
      ```
  
---

## 10주차: 로그인과 로그아웃 - 1 
> [수업후](https://github.com/jeky05/SPRING_20240866/commit/b8e8cccc474000de3b6c29aec47a45833183ba40) 

- 연습문제 : [입력값 필터링](https://github.com/jeky05/SPRING_20240866/commit/d86e55fd0d31198c68398e4b529c260732bf1c31)
- 필터링 오류 수정 : 주소 등의 빈칸 허용 필드가 빈칸을 허용하지 않음
  -> html 파일에서 required 삭제
  <img width="2166" height="884" alt="image" src="https://github.com/user-attachments/assets/be4df119-ee73-4f90-a359-725d2dc6789b" />

---

## 11주차: 로그인과 로그아웃 - 2
> [수업후](https://github.com/jeky05/SPRING_20240866/commit/d53493779139fb1f6750c87c026541008739695e) 

- 연습문제 : [게시판 수정하기](https://github.com/jeky05/SPRING_20240866/commit/782d6b7af6ca6922b5f0bb8effa28d24fa853f4c)
- 연습문제 : [게시글 내용 보기](https://github.com/jeky05/SPRING_20240866/commit/494e56ef852facf9aa88cea0ab9d63d6b4cb0749)
  ```
  <td th:if="${board.user.email}==${email}" > //themeleaf 의 조건문 기능 이용
  ```
  email 맵핑에 넣어줘야 함
  <img width="2172" height="868" alt="image" src="https://github.com/user-attachments/assets/46d9eaf9-e05c-4afc-b206-4fdd381dd60b" />


- 추가한 기능 : [세션만료시 로그인 페이지로 이동](https://github.com/jeky05/SPRING_20240866/commit/ab6df238c00f60955d756aa2880557b2e702875d)

---

## 12주차: 포트폴리오 완성
> [수업후](https://github.com/jeky05/SPRING_20240866/commit/ca12495c36c83151179927b76baec0fed510cde9)

- 연습문제 : [2명이상 로그인](https://github.com/jeky05/SPRING_20240866/commit/045a162c7b4ce5e26a5523cad5304f5361cf0378)
  - 로그인 : 사용자마다 다른 세션 생성
    ```
    @PostMapping("/api/login_check") // 로그인 처리
    public String checkMembers(@ModelAttribute AddMemberRequest request, Model model,
            HttpServletRequest httpRequest, HttpServletResponse response) {
        try {
            // 새로운 세션 생성
            HttpSession session = httpRequest.getSession(true);
            Member member = memberService.loginCheck(request.getEmail(), request.getPassword());

            // 사용자별 고유 세션 ID 생성
            String sessionId = UUID.randomUUID().toString();
            String email = request.getEmail();

            session.setAttribute("userId", sessionId);
            session.setAttribute("email", email);
            session.setAttribute("member", member);

            model.addAttribute("member", member);
            return "redirect:/board_list";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }
    ```

  - 로그아웃 : 현재 사용자의 세션과 쿠키만 삭제
    ```
    @GetMapping("/api/logout")
    public String member_logout(Model model, HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession(false);
            if (session != null) {
                // 현재 사용자 세션만 종료
                session.invalidate();

                // 현재 세션 쿠키만 삭제
                Cookie cookie = new Cookie("JSESSIONID", null);
                cookie.setPath(request.getContextPath().isEmpty() ? "/" : request.getContextPath());
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
            return "login";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }
    ```
    
- 연습문제 : [파일업로드](https://github.com/jeky05/SPRING_20240866/commit/630ecee93e0b1f7bf88931581fccedac94ff3528)
  - 파일명이 같은경우 : 원본파일(1).txt 방식으로 파일명 변경 후 업로드
  - 내용까지 같은경우 : 에러페이지로 이동
    ```
    if (Files.exists(filePath)) { // 파일이 이미 존재하는 경우
                String existingContent = Files.readString(filePath); // 기존 파일 내용 읽기

                if (!existingContent.equals(content)) { // 내용이 다르면 새 파일 생성
                    int counter = 1;
                    Path duplicatePath;
                    do {
                        String numberedName = sanitizedEmail + "(" + counter + ").txt";
                        duplicatePath = uploadPath.resolve(numberedName);
                        counter++;
                    } while (Files.exists(duplicatePath));
                    filePath = duplicatePath;
                } else {
                    // 내용이 동일하면 업로드 중단 및 오류 페이지로 리다이렉트
                    redirectAttributes.addFlashAttribute("message", "이미 동일한 내용의 파일이 존재합니다!");
                    return "redirect:/error_page/fileupload_error";
                }
            }
    ```
    
---














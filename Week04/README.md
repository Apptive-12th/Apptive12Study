## 1. Binding
  XML에서 선언한 View 들을 자바 코드에서 이용하기 위해 사용하는 것.<br>
  관련링크 : https://itlove.tistory.com/391 <br>

## 2. ViewPager
  프래그먼트를 보다 쉽게 처리 해주는 뷰<br>
  Viewpager는 프래그먼트를 처리해주는 단순 뷰 이고 처리는 Adapter에서 이루어진다.<br>
  
  > 뷰페이저 어댑터 코드
  <pre><code>
  public class ViewPagerAdapter extends FragmentPagerAdapter {

    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return fragment1;
        }else if(i==1){
            return fragment2;
        }else if(i==2){
            return fragment3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

  </code></pre>
  <br>
  관련링크 : https://medium.com/android-develop-android/android개발-6-viewpager이용하기-d5fad2f2ef1c
## 과제
+ 탭레이아웃 + 뷰페이저를 이용해서 본인 휴대폰 OS에 맞는 카카오톡 메인 화면 만들어오기.
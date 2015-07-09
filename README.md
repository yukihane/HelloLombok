# HelloLombok
Android Studio 1.2.2/1.3beta で lombok を使用するために行った手順の記録です。

## 1. lombok を依存関係に追加する ([ソース差分](https://github.com/yukihane/HelloLombok/commit/c49b075dd2101e58b32c1593960877916ac488ac))

[officialサイト] Gradle節の記述を参考に、dependencies に追加します。


## 2. lombok機能が使用できることを確認する ([ソース差分](https://github.com/yukihane/HelloLombok/commit/ee8f28f4b136a7eff7b6d1e18f238bb3a495400f))

@Getter @Setter で想定通りgetter/setter が使用できる。
ただしこのときAndroid Studio上では該当メソッドがない旨のエラーとなります。自動補完も効きません。
これはAndroid Studioにプラグインをインストールすることで解消されます。
インストール方法は[officialサイト]のAndroid Studio節に記載されています。


## 3. android-apt 使用設定を行う ([ソース差分](https://github.com/yukihane/HelloLombok/commit/023e24b0aa247602c5b464564f624240c3b37a79))

[officialサイト] Gradle節及びそこからリンクされている[android-aptサイト](https://bitbucket.org/hvisser/android-apt)
の記述を参考に、/build.gradle ファイル及び /app/build.gradele ファイルを編集します。


## 4. Android Stduio上のエラー解消のためビルドツールをアップグレード([ソース差分](https://github.com/yukihane/HelloLombok/commit/e7a3070be834ef3900cd6fac26cb4c5fdd825d36))

前節に記載したandroid-apt使用設定を行うと、Android Studio上で下記エラーが発生するようになりました。

<pre>
Error:Could not find property 'unitTestVariants' on com.android.build.gradle.AppExtension_Decorated@4305deb.
</pre>
この問題解消のため、[こちらの記述](http://stackoverflow.com/questions/31293943/)を参考に、ビルドツールのバージョンを上げました。


## 5. Android Studioを 1.2.2 から 1.3beta にアップグレード

前節の通り、ビルドツールのバージョンを1.2.3から1.3.0-beta4にアップグレードしたところ、
appを実行しようとすると(たまに？)下記エラーダイアログが表示され失敗するようになりました。
<pre>
Failed to complete Gradle execution
</pre>
そこでAndroid Studio自体のアップグレードも行ってみたところ、エラーは発生しなくなりました。


[officialサイト]: https://projectlombok.org/setup/android.html

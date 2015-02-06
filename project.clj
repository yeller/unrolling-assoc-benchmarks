(defproject bench-assoc-unrolling "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :jvm-opts ^:replace ["-server" "-Xmx1g" "-Xms1g" "-XX:+AggressiveOpts" "-XX:+UseFastAccessorMethods"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [criterium "0.4.1"]])

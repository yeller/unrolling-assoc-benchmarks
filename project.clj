(defproject bench-assoc-unrolling "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :jvm-opts ^:replace ["-server" "-Xmx1g" "-Xms1g" "-XX:+AggressiveOpts" "-XX:+UseFastAccessorMethods"]
  :global-exclusions [org.clojure/clojure]
  :dependencies [[com.yellerapp/clojure-unrolled-assoc "1.7.0-unrollassoc-SNAPSHOT"]
                 [criterium "0.4.1"]])

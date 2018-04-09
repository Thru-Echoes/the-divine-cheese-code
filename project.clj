(defproject the-divine-cheese-code "1.0.0-SNAPSHOT"
  :description "Look: we need the cheese back. Ok. It's that simple."
  :url "https://github.com/Thru-Echoes/the-divine-cheese-code"
  :mailing-list {:name "Olives"
                 :post "omuellerklein@berkeley.edu"
                 :subscribe "omuellerklein@berkeley.edu"
                 :unsubscribe "omuellerklein@berkeley.edu"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot the-divine-cheese-code.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

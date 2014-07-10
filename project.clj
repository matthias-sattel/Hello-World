(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [midje "1.3.0"]
                 [ring/ring-core "1.2.2"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [http-kit "2.1.16"]]
  :dev-dependencies [lein-midje "1.0.10"]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}}
  :main hello-world.core)

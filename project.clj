(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [midje "1.9.2-alpha2"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [http-kit "2.2.0"]
                 [org.clojure/core.async  "0.3.443"]]
  :dev-dependencies [lein-midje "3.2.1"]

  :min-lein-version "2.7.1"

  :jvm-opts ["-Xmx1g" "--add-modules" "java.xml.bind"]
  
  :main hello-world.core)

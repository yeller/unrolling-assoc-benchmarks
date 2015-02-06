(ns bench-assoc-unrolling
  (:require [criterium.core :refer [bench]]))

(defn bench-single-assoc []
  (bench
    (assoc {} :a-key 1)))

(defn bench-two-key-assoc []
  (bench
    (assoc {}
           :a-key 1
           :b-key 2)))

(defn bench-three-key-assoc []
  (bench
    (assoc {}
           :a-key 1
           :b-key 2
           :c-key 3)))

(defn bench-four-key-assoc []
  (bench
    (assoc {}
           :a-key 1
           :b-key 2
           :c-key 3
           :d-key 4)))

(defn bench-two-key-assoc-unrolled []
  (bench
    (-> {}
      (assoc :a-key 1)
      (assoc :b-key 2))))

(defn bench-three-key-assoc-unrolled []
  (bench
    (-> {}
      (assoc :a-key 1)
      (assoc :b-key 2)
      (assoc :c-key 3))))

(defn bench-four-key-assoc-unrolled []
  (bench
    (-> {}
      (assoc :a-key 1)
      (assoc :b-key 2)
      (assoc :c-key 3)
      (assoc :d-key 4))))

(def persistent-hash-map
  (into {}
        (map vector (range 20) (range 20))))

(defn bench-single-assoc-persistent-hash-map []
  (bench
    (assoc persistent-hash-map
           :a-key 1)))


(defn bench-two-key-assoc-persistent-hash-map []
  (bench
    (assoc persistent-hash-map
           :a-key 1
           :b-key 2)))

(defn bench-three-key-assoc-persistent-hash-map []
  (bench
    (assoc persistent-hash-map
           :a-key 1
           :b-key 2
           :c-key 3)))

(defn bench-four-key-assoc-persistent-hash-map []
  (bench
    (assoc persistent-hash-map
           :a-key 1
           :b-key 2
           :c-key 3
           :d-key 4)))

(defn bench-two-key-assoc-unrolled-persistent-hash-map []
  (bench
    (-> persistent-hash-map
      (assoc :a-key 1)
      (assoc :b-key 2))))

(defn bench-three-key-assoc-unrolled-persistent-hash-map []
  (bench
    (-> persistent-hash-map
      (assoc :a-key 1)
      (assoc :b-key 2)
      (assoc :c-key 3))))

(defn bench-four-key-assoc-unrolled-persistent-hash-map []
  (bench
    (-> persistent-hash-map
      (assoc :a-key 1)
      (assoc :b-key 2)
      (assoc :c-key 3)
      (assoc :d-key 4))))


(def benches
  {
   "bench-single-assoc" bench-single-assoc
   "bench-two-key-assoc" bench-two-key-assoc
   "bench-three-key-assoc" bench-three-key-assoc
   "bench-four-key-assoc" bench-four-key-assoc
   "bench-two-key-assoc-unrolled" bench-two-key-assoc-unrolled
   "bench-three-key-assoc-unrolled" bench-three-key-assoc-unrolled
   "bench-four-key-assoc-unrolled" bench-four-key-assoc-unrolled
   "bench-single-assoc-persistent-hash-map" bench-single-assoc-persistent-hash-map
   "bench-two-key-assoc-persistent-hash-map" bench-two-key-assoc-persistent-hash-map
   "bench-three-key-assoc-persistent-hash-map" bench-three-key-assoc-persistent-hash-map
   "bench-four-key-assoc-persistent-hash-map" bench-four-key-assoc-persistent-hash-map
   "bench-two-key-assoc-unrolled-persistent-hash-map" bench-two-key-assoc-unrolled-persistent-hash-map
   "bench-three-key-assoc-unrolled-persistent-hash-map" bench-three-key-assoc-unrolled-persistent-hash-map
   "bench-four-key-assoc-unrolled-persistent-hash-map" bench-four-key-assoc-unrolled-persistent-hash-map
   })

(defn -main [& args]
  (let [bench (get benches (first args))]
    (assert bench "not a valid bench")
    (bench)))

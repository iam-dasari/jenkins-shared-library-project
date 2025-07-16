// def gitCheckout(Map configMap) {
//     def BRANCH = configMap.get('branch')
//     def URL = configMap.get('url')
//     git branch: ${BRANCH}, url: ${URL}
// }

def call() {
    echo "Call Jenkins shared library"
}
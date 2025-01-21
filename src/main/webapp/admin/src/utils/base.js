const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm06oin/",
            name: "ssm06oin",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm06oin/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "员工在线知识培训考试平台"
        } 
    }
}
export default base

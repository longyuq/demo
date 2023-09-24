pipeline {
    agent any  // 选择任何可用的Jenkins代理进行构建

    stages {
        stage('Checkout') {
            steps {
                // 从版本控制系统（如Git）中检出代码
                echo 'pass'
            }
        }

        stage('Build') {
            steps {
                // 在此阶段执行构建任务
                sh 'uname -a'  // 使用Shell命令构建
            }
        }

        stage('Test') {
            steps {
                // 在此阶段执行测试任务
                sh 'ls'  // 使用Shell命令运行测试
            }
        }

        stage('Deploy') {
            steps {
                // 在此阶段执行部署任务
                sh 'ls'  // 使用Shell命令部署
            }
        }
    }

    post {
        success {
            // 如果构建成功，执行以下步骤
            echo 'Build and deployment were successful!'
        }
        failure {
            // 如果构建失败，执行以下步骤
            echo 'Build or deployment failed!'
        }
    }
}

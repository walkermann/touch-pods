# AirPods电量监测应用

一个用于Android设备监测AirPods电量的应用程序。

## 项目概述

本项目旨在为Android用户提供一个简单、稳定的AirPods电量监测工具，支持实时显示AirPods左右耳和充电盒的电量状态。

## 技术栈

- 开发语言：Kotlin
- UI框架：Jetpack Compose
- 架构模式：MVVM
- 最低支持Android版本：Android 7.0 (API 24)
- 目标Android版本：Android 13 (API 33)

## 已实现功能

### 1. 基础UI界面
- [x] 主界面布局
- [x] 电量显示卡片
- [x] 深色模式支持
- [x] Material Design主题

### 2. 蓝牙功能
- [x] 基础蓝牙权限配置
- [x] 蓝牙管理器框架
- [x] 设备扫描功能
- [x] GATT连接管理

### 3. 电量监测
- [x] 电量数据接收
- [x] 实时UI更新
- [x] 电量百分比显示
- [x] 进度条可视化

## 待实现功能

### 1. 权限管理
- [ ] 运行时权限请求
- [ ] 权限状态检查
- [ ] 权限说明界面

### 2. 蓝牙功能增强
- [ ] 自动重连机制
- [ ] 设备识别优化
- [ ] 连接状态管理
- [ ] 错误处理机制

### 3. 用户界面优化
- [ ] 设置界面
- [ ] 主题切换
- [ ] 动画效果
- [ ] 多语言支持

### 4. 通知功能
- [ ] 通知栏显示
- [ ] 低电量提醒
- [ ] 连接状态通知
- [ ] 自定义通知样式

### 5. 数据统计
- [ ] 使用时长统计
- [ ] 充电记录
- [ ] 电池健康分析
- [ ] 使用报告

## 项目结构

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/airpods/battery/monitor/
│   │   │   ├── MainActivity.kt          # 主活动
│   │   │   ├── bluetooth/
│   │   │   │   └── BluetoothManager.kt  # 蓝牙管理
│   │   │   └── ui/
│   │   │       └── theme/
│   │   │           └── Theme.kt         # 主题定义
│   │   │
│   │   └── AndroidManifest.xml          # 应用配置
│   └── test/                            # 测试代码
└── build.gradle                         # 应用级构建配置
```

## 开发环境配置

1. 开发工具
   - Android Studio 最新版本
   - JDK 8或更高版本
   - Android SDK 33

2. 依赖版本
   ```gradle
   kotlin_version = '1.8.0'
   compose_version = '1.4.0'
   core_ktx_version = '1.10.0'
   lifecycle_version = '2.6.1'
   material_version = '1.9.0'
   ```

## 运行说明

1. 克隆项目
   ```bash
   git clone [项目地址]
   ```

2. 打开项目
   - 使用Android Studio打开项目根目录
   - 等待Gradle同步完成

3. 运行项目
   - 点击"Run"按钮或使用快捷键Shift + F10
   - 选择目标设备或模拟器

## 打包说明

1. 调试版本
   ```bash
   ./gradlew assembleDebug
   ```

2. 发布版本
   ```bash
   ./gradlew assembleRelease
   ```

## 注意事项

1. 权限要求
   - 蓝牙权限
   - 位置权限（Android 12+）
   - 通知权限

2. 兼容性
   - 支持Android 7.0及以上版本
   - 需要设备支持BLE

3. 性能优化
   - 使用ProGuard进行代码优化
   - 实现低功耗运行
   - 优化内存使用

## 贡献指南

1. Fork项目
2. 创建特性分支
3. 提交更改
4. 推送到分支
5. 创建Pull Request

## 版本历史

- v1.0.0 (开发中)
  - 基础UI实现
  - 蓝牙连接框架
  - 电量显示功能

## 许可证

[待定]

## 联系方式

[待补充] 
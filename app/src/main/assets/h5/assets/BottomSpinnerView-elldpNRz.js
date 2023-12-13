import{d as I,q as C,r as $,o as J,h as v,c as f,b as s,t as m,u as E,p as b,l as L,_ as q,k as h,F as V,f as T,e as R,s as D,x as P,i as F,y as z,z as S,g as B,n as A}from"./index-4BXTZWGW.js";import{I as M}from"./RelativeItemView-Fg7wDgF1.js";const W=t=>(b("data-v-3540c0b3"),t=t(),L(),t),j={class:"robot"},G=W(()=>s("div",{style:{flex:"1"}},null,-1)),K={class:"message"},Q=I({__name:"BottomRobotView",props:{message:{type:String,required:!0}},setup(t){const n=t,{message:e}=C(n),o=$(),r=["robot-1","robot-2","robot-3","robot-4","robot-5","robot-6"];return J(()=>{var a;const l=Math.floor(Math.random()*r.length);return(a=o.value)==null?void 0:a.classList.add(r[l])}),(l,a)=>(v(),f("div",j,[G,s("div",{class:"robot-pic",ref_key:"robot",ref:o},null,512),s("div",K,m(E(e)),1)]))}}),Jt=q(Q,[["__scopeId","data-v-3540c0b3"]]);function X(t){if(!t)return;const n=t.querySelectorAll("img"),e=[];for(let o=0;o<n.length;o++){const r=n[o],l=r.src;l!=null&&l.length>0&&l.indexOf("/img/smiles")==-1&&(e.push(l),r.onclick=()=>{window.android&&window.android.onPreviewImage(l,e)})}t.querySelectorAll("span.text_mask").forEach(o=>{const r=o;r.onclick=l=>{l.preventDefault(),r.style.color="white"}})}const Y=t=>{if(t.classList.contains("text_mask"))return t.classList.contains("show")?t.classList.remove("show"):t.classList.add("show"),!0;const n=t.tagName.toLowerCase();if(n=="a")return!0;if(n=="img"&&window.android){const e=t;return e.getAttribute("smileid")==null&&window.android.onPreviewImage(e.src,[e.src]),!0}return!1},Z=(t,n,e)=>{const o=t.currentTarget;if(o&&n){const r=o.getBoundingClientRect();n.scrollTo({top:n.scrollTop+r.top-(e?40:10),behavior:"smooth"});const l=()=>{o.classList.remove("blinking"),o.removeEventListener("animationend",l)};o.classList.add("blinking"),o.addEventListener("animationend",l)}},tt=(t,n)=>{let e=n.replace(/<div class="quote">([^^]*?)<\/div>/,"").replace(/<span class="text_mask" style="([^^]*?)">([^^]*?)<\/span>/,"").replace(/<\/?[^>]+>/g,"").replace(/&lt;/g,"<").replace(/&gt;/g,">").replace(/\B@([^\W_]\w*)\b/g,"＠$1");return e.length>100&&(e=e.slice(0,100)+"..."),"[quote][b]"+t+"[/b] 说: "+e+"[/quote]"},et=t=>"　　"+(t||"").trim().replace(/&nbsp;/g," ").trim();async function ot(t){return new Promise(n=>setTimeout(n,t))}const x={optContentJs:X,optText:et,optReplyItemClick:Y,optReplyContent:tt,scrollIntoView:Z,delay:ot},N=t=>(b("data-v-085b452e"),t=t(),L(),t),nt={class:"comment"},st={class:"comment-title"},it=N(()=>s("div",{class:"title"},"精选留言",-1)),rt=N(()=>s("div",{style:{flex:"1"}},null,-1)),lt={class:"comment-content"},ct=["onClick"],at=["onClick"],dt={class:"time"},pt=["innerHTML","onClick"],ut=N(()=>s("div",{style:{height:"12px"}},null,-1)),_t={class:"comment-item"},vt=["onClick"],ft={class:"info"},gt=["onClick"],ht={class:"time"},mt=["innerHTML"],wt=I({__name:"CommentView",props:{target:{type:String,required:!0},comments:{type:Array,default:[],required:!0}},setup(t){const n=t,{target:e,comments:o}=C(n),r=p=>{window.android&&p.userId&&window.android&&window.android.onClickUser(p.userId)},l=(p,g,i)=>{const c=p.target;if(x.optReplyItemClick(c))return;x.scrollIntoView(p,document.querySelector(e==null?void 0:e.value),i==null);const _=(i==null?void 0:i.replyJs)||"",d=g.replyJs||"",y=_.length>0,u=y?_:d,w=i||g;if(window.android){if(u.length>0){y&&(w.replyQuote=x.optReplyContent(w.userName,w.replyContent)),window.android.onReplyUser(_.length>0?_:u,JSON.stringify(i||g));return}window.android.onNeedLogin()}},a=p=>{x.scrollIntoView(p,document.querySelector(e==null?void 0:e.value),!0),window.android&&window.android.onReplyNew()};return(p,g)=>(v(),f("div",nt,[s("div",st,[it,rt,s("div",{class:"write",onClick:g[0]||(g[0]=h(i=>a(i),["stop"]))},"写留言")]),(v(!0),f(V,null,T(E(o),i=>(v(),f("div",{class:"comment-item",key:i.id},[R(M,{class:"avatar",width:"36px",height:"36px",src:i.userAvatar,onClick:h(c=>r(i),["stop"])},null,8,["src","onClick"]),s("div",lt,[s("div",{class:"info",onClick:h(c=>l(c,i,null),["stop"])},[s("div",{class:"user-name",onClick:h(c=>r(i),["stop"])},m(i.userName),9,at),s("div",dt,m(i.time),1)],8,ct),s("div",{class:"topic-html",innerHTML:i.replyContent,onClick:h(c=>l(c,i,null),["stop"])},null,8,pt),ut,(v(!0),f(V,null,T(i.topicSubReply||[],c=>(v(),f("div",_t,[R(M,{class:"avatar",height:"24px",width:"24px",src:c.userAvatar,onClick:h(_=>r(c),["stop"])},null,8,["src","onClick"]),s("div",{class:"comment-content",onClick:h(_=>l(_,i,c),["stop"])},[s("div",ft,[s("div",{class:"user-name",onClick:h(_=>r(c),["stop"])},m(c.userName),9,gt),s("div",ht,m(c.time),1)]),s("div",{class:"topic-html",innerHTML:c.replyContent},null,8,mt)],8,vt)]))),256))])]))),128))]))}}),At=q(wt,[["__scopeId","data-v-085b452e"]]);function yt(t,n){const e=t.getBoundingClientRect();if(!n)return e.top>=0&&e.bottom<=window.innerHeight;const o=n.getBoundingClientRect();return e.top>=o.top&&e.bottom<=o.bottom}async function kt(t){return await A(),t.value instanceof HTMLElement?t.value:t.value?document.querySelector(t.value):null}function H(t){let n=`0px 0px ${t.distance}px 0px`;t.top&&(n=`${t.distance}px 0px 0px 0px`);const e=new IntersectionObserver(o=>{o[0].isIntersecting&&(t.firstload&&t.emit(),t.firstload=!0)},{root:t.parentEl,rootMargin:n});return e.observe(t.infiniteLoading.value),e}const U=(t,n)=>{const e=t.__vccOpts||t;for(const[o,r]of n)e[o]=r;return e},xt={},It=t=>(b("data-v-d3e37633"),t=t(),L(),t),Ct={class:"container"},bt=It(()=>s("div",{class:"spinner"},null,-1)),Lt=[bt];function St(t,n){return v(),f("div",Ct,Lt)}const $t=U(xt,[["render",St],["__scopeId","data-v-d3e37633"]]),Rt={class:"state-error"},Bt=I({__name:"InfiniteLoading",props:{top:{type:Boolean,default:!1},target:{},distance:{default:0},identifier:{},firstload:{type:Boolean,default:!0},slots:{}},emits:["infinite"],setup(t,{emit:n}){const e=t;let o=null,r=0;const l=$(null),a=$(""),{top:p,firstload:g,distance:i}=e,{identifier:c,target:_}=C(e),d={infiniteLoading:l,top:p,firstload:g,distance:i,parentEl:null,emit(){r=(d.parentEl||document.documentElement).scrollHeight,y.loading(),n("infinite",y)}},y={loading(){a.value="loading"},async loaded(){a.value="loaded";const u=d.parentEl||document.documentElement;await A(),p&&(u.scrollTop=u.scrollHeight-r),yt(l.value,d.parentEl)&&d.emit()},complete(){a.value="complete",o==null||o.disconnect()},error(){a.value="error"}};return D(c,()=>{o==null||o.disconnect(),o=H(d)}),J(async()=>{d.parentEl=await kt(_),o=H(d)}),P(()=>{o==null||o.disconnect()}),(u,w)=>(v(),f("div",{ref_key:"infiniteLoading",ref:l,style:{"min-height":"1px"}},[F(s("div",null,[S(u.$slots,"spinner",{},()=>[R($t)],!0)],512),[[z,a.value=="loading"]]),a.value=="complete"?S(u.$slots,"complete",{key:0},()=>{var k;return[s("span",null,m(((k=u.slots)==null?void 0:k.complete)||"No more results!"),1)]},!0):B("",!0),a.value=="error"?S(u.$slots,"error",{key:1,retry:d.emit},()=>{var k;return[s("span",Rt,[s("span",null,m(((k=u.slots)==null?void 0:k.error)||"Oops something went wrong!"),1),s("button",{class:"retry",onClick:w[0]||(w[0]=(...O)=>d.emit&&d.emit(...O))},"retry")])]},!0):B("",!0)],512))}}),Ut=U(Bt,[["__scopeId","data-v-a7077831"]]),Et=t=>(b("data-v-18fb154c"),t=t(),L(),t),qt={key:0,class:"spinner-container"},Nt=Et(()=>s("div",{class:"spinner"},null,-1)),Vt=[Nt],Tt=I({__name:"BottomSpinnerView",props:{show:{type:Boolean,default:!0}},setup(t){const n=t,{show:e}=C(n);return(o,r)=>E(e)?(v(),f("div",qt,Vt)):B("",!0)}}),Ot=q(Tt,[["__scopeId","data-v-18fb154c"]]);export{Ot as B,At as C,Ut as W,Jt as a,x as c};
